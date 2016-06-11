package Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import guitar.*;
import Dao.guitarDao;
import DBUtil.DBUtil;

public class guitarImpl implements guitarDao {
	
	 public List<guitar> getAllGuitars(){
			Connection Conn = DBUtil.getConnection();
			String sql = "select * from Guitar";
			List<guitar> inventory = new ArrayList<guitar>();
			try {
				PreparedStatement pstmt = Conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					guitarspec spec = new guitarspec( null, null, null, null,null);
					spec.setBuilder(rs.getString("builder"));
					spec.setModel(rs.getString("model"));
					spec.setType(rs.getString("type"));
					spec.setTopWood(rs.getString("topWood"));
					spec.setBackWood(rs.getString("backWood"));				
					guitar guitar = new guitar(rs.getString("serialNumber"),rs.getDouble("price"),spec);
					inventory.add(guitar);				
				}			
				rs.close();
				pstmt.close();
				Conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} catch(Exception e){
			    e.printStackTrace();	
			}finally{
				try{
			         if(Conn!=null)
			        	 Conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }
			}
			return inventory;
	 }
		public  Inventory Inventory()
		{
			Inventory inventory = new Inventory();
			DBUtil jdbc=new DBUtil();
			Connection conn = jdbc.getConnection();
			PreparedStatement pstat;
			ResultSet rs;
			try {
				pstat = conn.prepareStatement("select * from guitar");
				rs = pstat.executeQuery();
				while (rs.next()) {
					guitarspec spec = new guitarspec( null, null, null, null,null);
					spec.setBuilder(rs.getString("builder"));
					spec.setModel(rs.getString("model"));
					spec.setType(rs.getString("type"));
					spec.setTopWood(rs.getString("topWood"));
					spec.setBackWood(rs.getString("backWood"));
					inventory.add(rs.getString("serialNumber"), rs.getDouble("price"), spec);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally{
				try {
					jdbc.closeConnection(conn);
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
			}
			return inventory;
		}
		public void add(String serialNumber, double price,
	            guitarspec spec) {
			String sql="insert into guitar(serialNumber,builder,price,model,type,backWood,topWood) values(?,?,?,?,?,?,?)";
			Connection conn=DBUtil.getConnection();
			
			try {
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setString(1, serialNumber);
				ps.setString(2, spec.getBuilder());
				ps.setDouble(3, price);
				ps.setString(4,spec.getModel());			
				ps.setString(5, spec.getType());
			    ps.setString(6, spec.getBackWood());	
			    ps.setString(7, spec.getTopWood());			
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			
			}
		}
		 public void delete(String serialNumber) {
				String sql="delete from guitar where serialNumber=?";
		//		DBUtil jdbc=new DBUtil();
				Connection conn=DBUtil.getConnection();
				
				try {
					PreparedStatement ps=conn.prepareStatement(sql);
					ps.setString(1, serialNumber);
					ps.executeUpdate();
				} catch (SQLException e) {
				
					e.printStackTrace();
				}	
			}

		
}

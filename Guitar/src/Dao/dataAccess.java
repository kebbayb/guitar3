package Dao;

public class dataAccess {
	private static String daoName = "sqliteDao";
//	private static String daoName = "mysqlDao";
	public static guitarDao createguitarDao() {
		guitarDao result = null;
		try {
			Object o = Class.forName(daoName + "." + "guitarImpl").newInstance();
			result = (guitarDao)o;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}
}

package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Dao.dataAccess;
import Dao.guitarDao;
import guitar.guitarspec;

public class add extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		guitarspec spec = new guitarspec(null, null, null, null, null);
		spec.setBackWood(request.getParameter("backwood"));
		spec.setBuilder(request.getParameter("builder"));
		spec.setModel(request.getParameter("model"));
		spec.setTopWood(request.getParameter("topwood"));
		spec.setType(request.getParameter("type"));
		String serialNumber=request.getParameter("serialnumber");
		double price= Double.valueOf(request.getParameter("price").toString());		
		guitarDao i = dataAccess.createguitarDao();
		i.add(serialNumber, price, spec);		
 	 	request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}

package action;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import Dao.dataAccess;
import Dao.guitarDao;

public class delete extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取系列号
		String serialNumber=request.getParameter("serialNumber");
		guitarDao i = dataAccess.createguitarDao();
		i.delete(serialNumber);		
 	 	request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}

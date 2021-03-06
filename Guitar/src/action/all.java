package action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Dao.guitarDao;
import model.guitar;
import Dao.dataAccess;


public class all extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public all(){
		super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		guitarDao i = dataAccess.createguitarDao();
		List<guitar> all=i.getAllGuitars();
		System.out.println(all);
		request.setAttribute("list", all);
		request.getRequestDispatcher("all.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

package action;

    import java.io.IOException;
	import java.util.LinkedList;
	import java.util.List;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;


	import Dao.dataAccess;
	import Dao.guitarDao;
import model.guitarspec;
	@SuppressWarnings("serial")
	public class search extends HttpServlet{
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}
		@SuppressWarnings("rawtypes")
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
		
			guitarspec spec = new guitarspec(null, null, null, null, null);
			spec.setBackWood(request.getParameter("backwood"));
			spec.setBuilder(request.getParameter("builder"));
			spec.setModel(request.getParameter("model"));
			spec.setTopWood(request.getParameter("topwood"));
			spec.setType(request.getParameter("type"));				
			List searchguitars = new LinkedList();
			guitarDao i = dataAccess.createguitarDao();
			searchguitars = i.Inventory().search(spec);					
			System.out.println(searchguitars);			
			request.setAttribute("res", searchguitars);
			if (!searchguitars.isEmpty()) {
		        request.getRequestDispatcher("/result.jsp").forward(request,response);
		      } else {
		        System.out.println("对不起，暂无此商品。");
		      }	
		}
	}





import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import college.Student;

/**
 * Servlet implementation class UpdateStu
 */
@WebServlet("/UpdateStu")
public class UpdateStu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Student s = new Student();
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pno = request.getParameter("pno");
		s.setId(id);
		s.setName(name);
		s.setPh_no(pno);
		System.out.println("Name"+name);
		System.out.println("ID"+id);
		System.out.println("pno"+pno);
		try {
			
			Operations op = new Operations();
			 op.updateStudent(s);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("fetch.html");
	}

}

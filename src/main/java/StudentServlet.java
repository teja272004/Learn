

import java.io.IOException;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import college.Student;


/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final Logger l = Logger.getLogger(StudentServlet.class.getName());
	//private static final Logger logger = Logger.getLogger(StudentServlet.class.getName());
	private static final long serialVersionUID = 1L;
	
       //private Student s = new Student();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
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
		// TODO Auto-generated method stub
		l.info("Insert Servlet Started");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pno = request.getParameter("pno");
		Student st = new Student();
		st.setId(id);
		st.setName(name);
		st.setPh_no(pno);
		System.out.println(st.getId());
		System.out.println(st.getName());
		Operations op = new Operations();
		try {
			op.insertStudent(st);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("fetch.html");
		
	}

}

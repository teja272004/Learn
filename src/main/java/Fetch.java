

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fetch
 */
@WebServlet("/Fetch")
public class Fetch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fetch() {
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
		response.setContentType("text/html");	
		//PrintWriter out = response.getWriter();
		ArrayList<String[]> al = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "bhanuteja");
			PreparedStatement ps = ct.prepareStatement("select * from list_of_students");
			
			 ResultSet rs = ps.executeQuery("select * from list_of_students");
			 
			 while(rs.next()) {
				 String[] student = new String[3];
				 String id = rs.getString("id");
				 String name = rs.getString("name_student");
				 String pno = rs.getString("ph_no");
				 student[0]=id;
				 student[1]=name;
				 student[2]=pno;
				 al.add(student);
				 System.out.println(student[0]);
				 System.out.println(student[1]);
				 System.out.println(student[2]);
			 }
			 request.setAttribute("student",al);
			 RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
			 rd.forward(request, response);
			
		}
		catch(Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		}
		
		
	
	}

}

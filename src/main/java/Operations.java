import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import college.Student;

public class Operations {
	//private static final String PreparedStatement = null;
	String jdbcurl="jdbc:mysql://host:3306/student";
	String Username = "root";
	String password = "bhanuteja";
	public int insertStudent(Student s) throws ClassNotFoundException {
	String insert_to_sql = "insert into list_of_students(id,name_student,ph_no) values (?,?,?)";
	int r=0;
	
	Class.forName("com.mysql.jdbc.Driver");
	try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","bhanuteja"))
	{
		PreparedStatement ps = conn.prepareStatement(insert_to_sql);
		ps.setString(1, s.getId());
		ps.setString(2, s.getName());
		ps.setString(3, s.getPh_no());
		System.out.println(ps);
		r = ps.executeUpdate();
		//return r;
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return r;
	}
	public int deleteStudent(String id) throws ClassNotFoundException {
		String delete_to_sql = "delete from list_of_students where id = ?";
		int r=0;
		
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","bhanuteja")){
			PreparedStatement ps = cn.prepareStatement(delete_to_sql);
			ps.setString(1,id);
			r = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return r;
		
	}
	public int updateStudent(Student s) throws ClassNotFoundException {
		String update_sql = "update list_of_students set name_student = ?, ph_no = ? where id = ?";
		int result = 0;

		Class.forName("com.mysql.jdbc.Driver");
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","bhanuteja")) {
			PreparedStatement ps = conn.prepareStatement(update_sql);
			ps.setString(1, s.getName());
			ps.setString(2, s.getPh_no());
			ps.setString(3, s.getId());
			
			result = ps.executeUpdate();
			System.out.println(ps);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}

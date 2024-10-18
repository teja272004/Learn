package college;
//import java.util.*;


public class Student {
	private String id;
	private String name;
	private String ph_no;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPh_no() {
		return ph_no;
	}
	public void setPh_no(String ph_no) {
		this.ph_no = ph_no;
	}
	public Student(String id, String name, String ph_no) {
		super();
		this.id = id;
		this.name = name;
		this.ph_no = ph_no;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	

}

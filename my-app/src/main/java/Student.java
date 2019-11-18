import java.util.ArrayList;
import java.util.List;

public class Student {

	private String name; 
	private int age; 
	private String dob;
	private String username;
	private List<Module> modules = new ArrayList<Module>();
	private List<Course> courses = new ArrayList<Course>();

	public Student() {
		
	}
	
	public Student(String studentName, int age, String dob, String username) {
		setName(studentName);
		setAge(age);
		setDob(dob);
		getUsername();
	}

	public void addModule(Module mod) { 
		modules.add(mod);
	}

	public List<Module> getModules() { 
		return modules;
	}

	public void addCourse(Course course) {
		courses.add(course);
	}

	public List<Course> getCourses() {
		return courses;
	}
	
	public String getUsername(){
		username = name + Integer.toString(age);

		return username;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) { 
		this.age = age;
	}

	public int getAge() { 
		return age;
	}

	public void setDob(String dob) { 
		this.dob = dob;
	}

	public String getDob() { 
		return dob;
	}

	
}




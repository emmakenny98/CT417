import java.util.ArrayList;
import java.util.List;

public class Module {
    private String name;
    private String id;
    private List<Student> students = new ArrayList<Student>();
    private List<Course> courses = new ArrayList<Course>();

    public Module() {
    	
    }
    
    public Module(String name, String id) {
    		setName(name);
    		setId(id);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) { 
        this.id = id;
    }

    public String getId() { 
        return id;
    }

    public void addStudent(Student student) { 
        students.add(student);
    }

    public void addCourse(Course course) { 
        courses.add(course);
    }

    public List<Student> getStudents() { 
        return students;
    }

    public List<Course> getCourses() { 
        return courses;
    }
}

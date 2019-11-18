import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Course { 

    private String courseName;
    private List<Module> modules = new ArrayList<Module>();
    private List<Student> students = new ArrayList<Student>(); 
    private LocalDate startDate;
    private LocalDate endDate;

    public Course() { 

    }
    
    public Course(String name, LocalDate start, LocalDate end) { 
    		setCourseName(name);
    		setStartDate(start);
    		setEndDate(end);
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() { 
        return courseName;
    }

    public void addModule(Module mod) {
        modules.add(mod);
    }

    public List<Module> getModules() { 
        return modules;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() { 
        return students; 
    }
    
    public void setStartDate(LocalDate startDate) {
    		this.startDate = startDate;
    }
    
    public LocalDate getStartDate() { 
    		return startDate;
    }
    
    public void setEndDate(LocalDate endDate) { 
    		this.endDate = endDate;
    }
    
    public LocalDate getEndDate() {
    		return endDate;
    }
}


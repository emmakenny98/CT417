import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Test {

	@org.junit.jupiter.api.Test
	void testUserNameOfStudent() {
		Student emma = new Student("Emma", 21, "07/01/1998", "16455696");
		
		assertEquals("Emma21", emma.getUsername(), "Should be Emma21");
		
	}
	
	@org.junit.jupiter.api.Test
	void testAddModuleOfStudent() { 
		Student emma = new Student("Emma", 21, "07/01/1998", "16455696");
		Module softwareEng = new Module("Software Engineering", "CT417");
		List<Module> modules = new ArrayList<Module>();
		
		emma.addModule(softwareEng);
		modules.add(softwareEng);
		
		assertEquals(modules, emma.getModules(), "Not equal");
	}
	
	@org.junit.jupiter.api.Test
	void testAddCourseofStudent() {
		Student emma = new Student("Emma", 21, "07/01/1998", "16455696");
		Course computer = new Course("Computer Science", LocalDate.of(2016, 9, 01), LocalDate.of(2020, 5, 31));
		List<Course> courses = new ArrayList<Course>();
		
		emma.addCourse(computer);
		courses.add(computer);
		
		assertEquals(courses, emma.getCourses(), "Not equal");
		
	}
	
	@org.junit.jupiter.api.Test
	void testStudentName() { 
		Student student = new Student();
		student.setName("Emma");
		
		assertEquals("Emma", student.getName(), "Not equal");
	}
	
	@org.junit.jupiter.api.Test
	void testStudentDob() { 
		Student student = new Student();
		student.setDob("07/01/1998");
		
		assertEquals("07/01/1998", student.getDob(), "Not equal");
	}
	
	@org.junit.jupiter.api.Test
	void testStudentAge() { 
		Student student = new Student();
		student.setAge(21);
		
		assertEquals(21, student.getAge(), "Not equal");
	}
	
	@org.junit.jupiter.api.Test
	void testModuleName() { 
		Module mod = new Module();
		mod.setName("Programming");
		
		assertEquals("Programming", mod.getName(), "Not equal");
	}
	
	@org.junit.jupiter.api.Test
	void testModuleId() { 
		Module mod = new Module();
		mod.setId("CT123");
		
		assertEquals("CT123", mod.getId(), "Not equal");
	}
	
	@org.junit.jupiter.api.Test
	void testAddStudentOfModule() {
		Module mod = new Module();
	
		List<Student> students = new ArrayList<Student>();
		Student david = new Student();
		Student emma = new Student();
		
		mod.addStudent(david);
		mod.addStudent(emma);
		
		students.add(david);
		students.add(emma);
	
		
		assertEquals(students, mod.getStudents(), "Not equal");
		
	}
	
	@org.junit.jupiter.api.Test
	void testAddCourseOfModule() {
		Module mod = new Module();
	
		List<Course> courses = new ArrayList<Course>();
		Course computerSci = new Course();
		Course engineering = new Course();
		
		
		mod.addCourse(computerSci);
		mod.addCourse(engineering);
		
		courses.add(computerSci);
		courses.add(engineering);
		
		assertEquals(courses, mod.getCourses(), "Not equal");
		
	}
	
	@org.junit.jupiter.api.Test
	void testCourseName() { 
		Course compSci = new Course();
		compSci.setCourseName("Computer Science");
		
		assertEquals("Computer Science", compSci.getCourseName(), "Not equal");
	}
	
	@org.junit.jupiter.api.Test
	void testAddModuleOfCourse() {
		Course compSci = new Course();
	
		List<Module> modules = new ArrayList<Module>();
		Module programming = new Module();
		Module professionalSkills = new Module();
		
		compSci.addModule(programming);
		compSci.addModule(professionalSkills);
		
		modules.add(programming);
		modules.add(professionalSkills);
		
		assertEquals(modules, compSci.getModules(), "Not equal");
		
	}
	
	@org.junit.jupiter.api.Test
	void testAddStudentOfCourse() {
		Course compSci = new Course();
	
		List<Student> students = new ArrayList<Student>();
		Student david = new Student();
		Student emma = new Student();
		
		compSci.addStudent(david);
		compSci.addStudent(emma);
		
		students.add(david);
		students.add(emma);
	
		
		assertEquals(students, compSci.getStudents(), "Not equal");
		
	}

}


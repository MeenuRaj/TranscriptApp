import static org.junit.Assert.*;
import org.junit.*;

public class TranscriptTest {

	@Test
	public void test_GPA() {
		System.out.println("Test if the Average GPA returned is accurate");
		Transcript trans = new Transcript();
		CourseEnrollment course = new CourseEnrollment();
		CourseEnrollment course1 = new CourseEnrollment();
		course.setGrade("A");
		course1.setGrade("B");
		trans.addCourse(course);
		trans.addCourse(course1);
		assertTrue((trans.getOverallGPA()) == 3.5);
	}

	@Test
	public void test_Ltonum() {
		System.out.println("Tests if A converts to 4.0");
		CourseEnrollment course = new CourseEnrollment();
		course.setGrade("A");
		assertTrue((course.getGPAgrade()) == 4.0);
	}

	@Test
	public void test_Ltonum2() {
		System.out.println("Tests if B converts to 3.0");
		CourseEnrollment course = new CourseEnrollment();
		course.setGrade("B");
		assertTrue((course.getGPAgrade()) == 3.0);
	}

	@Test
	public void test_Ltonum3() {
		System.out.println("Tests if C converts to 2.0");
		CourseEnrollment course = new CourseEnrollment();
		course.setGrade("C");
		assertTrue((course.getGPAgrade()) == 2.0);
	}

	@Test
	public void test_Ltonum4() {
		System.out.println("Tests if D converts to 1.0");
		CourseEnrollment course = new CourseEnrollment();
		course.setGrade("D");
		assertTrue((course.getGPAgrade()) == 1.0);
	}

	@Test
	public void test_Ltonum5() {
		System.out.println("Tests if F converts to 4.0");
		CourseEnrollment course = new CourseEnrollment();
		course.setGrade("F");
		assertTrue((course.getGPAgrade()) == 0.0);
	}

	@Test
	public void test_OverallGPA() {
		System.out.println("Test if the Average GPA returned is accurate");
		Transcript trans = new Transcript();
		CourseEnrollment course = new CourseEnrollment();
		CourseEnrollment course1 = new CourseEnrollment();
		CourseEnrollment course2 = new CourseEnrollment();
		course.setGrade("A");
		course1.setGrade("B");
		course2.setGrade("D");
		trans.addCourse(course);
		trans.addCourse(course1);
		trans.addCourse(course2);
		System.out.println(trans.getOverallGPA() + "  "
				+ trans.getFormattedGPA());
		assertTrue((trans.getOverallGPA()) == 2.6666666666666665);
	}

	@Test
	public void test_formattedGPA() {
		
		Transcript trans = new Transcript();
		CourseEnrollment course = new CourseEnrollment();
		CourseEnrollment course1 = new CourseEnrollment();
		CourseEnrollment course2 = new CourseEnrollment();
		course.setGrade("A");
		course1.setGrade("B");
		course2.setGrade("D");
		trans.addCourse(course);
		trans.addCourse(course1);
		trans.addCourse(course2);
		System.out.println("Shows that formatted GPA =" +trans.getFormattedGPA());
		assertTrue((trans.getFormattedGPA().equals("2.67")));
	}

	@Test
	public void test_formattedGPA2() {
		Transcript trans = new Transcript();
		CourseEnrollment course = new CourseEnrollment();
		CourseEnrollment course1 = new CourseEnrollment();
		CourseEnrollment course2 = new CourseEnrollment();
		course.setGrade("A");
		course1.setGrade("B");
		course2.setGrade("D");
		trans.addCourse(course);
		trans.addCourse(course1);
		trans.addCourse(course2);
		System.out.println("Shows that formatted GPA is not 2.6667");
		assertFalse((trans.getFormattedGPA().equals("2.6667")));
	}

}

import java.util.ArrayList;
import java.util.Scanner;

public class TranscriptApp {

	public static void main(String[] args) {

		Transcript transcript = new Transcript();
		ArrayList<CourseEnrollment> alist = new ArrayList<CourseEnrollment>();

		Scanner scan = new Scanner(System.in);
		String course = "";
		int credits = 0;
		String grade = "";
		System.out.println("Welome to the Transcript Application");
		System.out.println();
		System.out.println("Do you want to enter an item?(y/n) ");
		String choice = scan.next();
		scan.nextLine();
		while (choice.equalsIgnoreCase("y")) {

			
			course = Validator.getString(scan, "Enter course: ");
			credits = Validator.getInt(scan, "Enter credits: ", 1, 4);

			grade = Validator.getString(scan, "Enter grade: ");

			CourseEnrollment courseenrollment = new CourseEnrollment();
			courseenrollment.setCode(course);
			courseenrollment.setCredits(credits);
			courseenrollment.setGrade(grade);

			transcript.addCourse(courseenrollment);

			alist = transcript.getCourses();

			System.out.print("Continue? (y/n): ");
			choice = scan.nextLine();
			System.out.println();

		}

		alist = transcript.getCourses();

		System.out.println("Course\t\tCredits\t\tGrade\t\tQuality Point");
		System.out.println("------\t\t-------\t\t-----\t\t-------------");

		for (CourseEnrollment print : alist) {
			System.out.println(print.getCode() + "\t" + print.getCredits()
					+ "\t\t" + print.getGrade() + "\t\t" + print.getGPAgrade());

			System.out.println();
		}
		System.out.println("\t\t\t\t\tGPA\t" + transcript.getOverallGPA());

	}

}

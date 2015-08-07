import java.text.DecimalFormat;
import java.util.ArrayList;

public class Transcript {

	ArrayList<CourseEnrollment> list;

	public Transcript() {
		list = new ArrayList<CourseEnrollment>();
	}

	public void addCourse(CourseEnrollment courseenrollment) {
		list.add(courseenrollment);
	}

	public ArrayList<CourseEnrollment> getCourses() {
		return list;
	}

	public double getOverallGPA() {
		double GPA = 0;
		double avgGPA = 0;
		try{
			
		for (CourseEnrollment course : list) {
			GPA = (GPA + course.getGPAgrade());
			avgGPA = GPA/list.size()		;
		}
		
		}catch(ArithmeticException e){
			System.out.println("Calculate agin");
		}catch(Exception e)
		{
			System.out.println("There is something wrong!");
		}
		finally {
		      System.out.println("finally block will execute.");
		  
		  }
		return avgGPA;
	}
	
	public String getFormattedGPA()
	{
		DecimalFormat formatter = new DecimalFormat("#0.00");
		return formatter.format(this.getOverallGPA());
	}
}

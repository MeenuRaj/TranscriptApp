public class CourseEnrollment {

	private String code;
	private int credits;
	private String grade;
	private double gpagrade;

	public CourseEnrollment() {

		this.code = "";
		this.credits = 0;
		this.grade = "";
		this.gpagrade = 0;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getCredits() {
		return credits;
	}
 
	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getGPAgrade() {
		if (grade.equalsIgnoreCase("A"))
			gpagrade = 4.0;
		else if (grade.equalsIgnoreCase("B"))
			gpagrade = 3.0;
		else if (grade.equalsIgnoreCase("C"))
			gpagrade = 2.0;
		else if (grade.equalsIgnoreCase("D"))
			gpagrade = 1.0;
		else
			gpagrade = 0.0;
		return gpagrade;
	}

}

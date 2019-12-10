
public class Student extends Person {

	String course;
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getCourse() {
		return course;
	}
	
	@overridding
	public void speak(String speak) {
		System.out.println("Method overridding in progress...");
		System.out.println(speak);
	}
	
}

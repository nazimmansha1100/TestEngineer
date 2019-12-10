
public class Person {
	
	String firstName;
	String lastName;
	int age;
	private int personID;
	private static int idCardNumber;
	
	public Person(){
		
		personID = idCardNumber++;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	
	}
		
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getFirstName() {
		
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void speak(String speak) {
		System.out.println("I am talking!! "+ speak);
	}
	
	public int getIdCardNumber() {
		return personID;
	}
	
}


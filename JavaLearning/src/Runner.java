
public class Runner {

	
	public static void main(String[] args) {
		// person 
		
		Person nazim = new Person();
		nazim.setFirstName("Muhammad");
		nazim.setLastName("Nazim");
		nazim.setAge(26);
		
		
		Person maria = new Person();
		maria.setFirstName("Maria");
		maria.setLastName("Nazim");
		maria.setAge(22);
		
		Person abdul = new Person();
		abdul.setFirstName("Abdul");
		abdul.setLastName("Ghafor");
		abdul.setAge(42);
		
		
		
		System.out.println(maria.firstName +  " " + maria.lastName);
		System.out.println(nazim.firstName + " " + nazim.lastName);
		
		
		System.out.println("Nazim is " + nazim.getAge() + " Nazim id card: " + nazim.getIdCardNumber());
		System.out.println("Maria is " + maria.age + 
				" years old." + "Id card number : " + maria.getIdCardNumber());
		System.out.println("Abdul is :" + abdul.getAge() + " years old " +
				abdul.getFirstName() + " " + abdul.getLastName() + " Id: " + abdul.getIdCardNumber());
		abdul.speak("");
		abdul.speak("Pakistan Zindabad");
		
		
		Student st1 = new Student();
		st1.setFirstName("Saba");
		st1.setLastName("Gul");
		st1.speak("Hi ! Class...");
	}

}

package inheritence;

public class Programmer extends Employee {
	
	String name = "Fatema";

	public static void main(String[] args) {
		Programmer obj = new Programmer();
		System.out.println(obj.name);
		System.out.println(obj.salary);
		System.out.println(obj.age);
	}

}

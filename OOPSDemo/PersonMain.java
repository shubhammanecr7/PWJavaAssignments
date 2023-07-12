package test;

class Person {
	private String name;
	private int age;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

public class PersonMain {
	public static void main(String[] args) {
		Person person = new Person();

		person.setName("Shubham Mane");
		person.setAge(25);
		person.setAddress("518 Palus Sangli");

		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		System.out.println("Address: " + person.getAddress());
	}
}

class Person implements Cloneable{
	
	private String name;
	Address address;

	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name : " + this.name + " \nCity : " + this.address.getCity() + " \nState : " + this.address.getState() + " \nStreet : " + this.address.getStreet();
	}
	
	@Override
	protected Person clone() throws CloneNotSupportedException {
		Person other = (Person)super.clone();
		return other;
	}
}

public class Main {
	public static void main(String args[]) {
		
		Address a = new Address("Maharashtra" , "Nashik", "Kamathwade");
		Person p1 = new Person("Harshada", a);
		
		System.out.println(p1.toString());
		System.out.println();
		
		Person p2;
		try {
			p2 = p1.clone();
//			p2.setName("Akshada");
			System.out.println(p2.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}

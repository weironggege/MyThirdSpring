package Spring.beans.autowire;

public class Person {

	private String name;
	private Address address;
	private int age;
	private Car car;
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
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + ", car=" + car + "]";
	}
	
	
}

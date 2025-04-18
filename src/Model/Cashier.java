package Model;

public class Cashier extends Employee {
    public Cashier() {
    	this.options=new Option[] {};
	}
	public Cashier(int ID,String firstName,String lastName,String email,String phoneNumber,String address,String password,double salary) {
		this.ID=ID;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.password = password;
		this.salary=salary;
		this.options=new Option[] {};
	}
	@Override
	public int getDepartment() {
		return 1;
	}
	@Override
	public void showList() {
		System.out.println("Cashier List");
	}
}

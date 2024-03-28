package Bank;

public class Bank {
	String name;
	String ifsc;
	String address;
	Customer cust;
	
	
	public Bank(String name, String ifsc, String address, Customer cust) {
		super();
		this.name = name;
		this.ifsc = ifsc;
		this.address = address;
		this.cust = cust;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer obj=new Customer("Ajay", 1234, 9555474441L ," gzb", 500.00);
		Bank ob= new Bank("SC","SC00001","Sec 135",obj );
		System.out.println("Bank and customer details "+ob);
		System.out.println("initial balance= "+obj.balance);
		obj.depo(200000);
		System.out.println("available balance= "+obj.balance);
		obj.withdrawal(44600);
		System.out.println("available balance= "+obj.balance);
 
	}
	
	@Override
	public String toString() {
		return "Bank [name=" + name + ", Ifsc=" + ifsc + ", address=" + address + ", cust=" + cust + "]";
	}
	 
	
	
}

package Bank;

//import com.customexception.invalidedge;

public class Customer {
	String name;
	int accNum;
	Long contactnum;
	String address;
	Double balance;
	
	public Double getBalance() {
		return balance;
	}
 
	public void setBalance(double balance) {
		if(balance>500)
		this.balance = balance;
	}
	
	public Customer(String name, int i, Long contactNum, String address, Double balance) {
		super();
		this.name = name;
		this.accNum = i;
		this.contactnum = contactNum;
		this.address = address;
		this.balance = balance;
		}
	
	public void depo(int i) {
		if(i>=500)
			balance+=i;
		else
			System.out.println("Deposit not possible");
		
	}
	public void withdrawal(int i) {
		if(balance-i<500)
			System.out.println("Withdrawal not valid");
		else
			balance-=i;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", AccNum=" + accNum + ", contactnum=" + contactnum + ", address=" + address
				+ ", balance=" + balance + "]";
	}
	
	public static void main(String[] args) throws invalidcustid {
		try{
			validatecustid(1245);
		}
		catch(invalidcustid e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Hi");
		}
	}
	public static void validatecustid(int accNum) throws invalidcustid {
		int length = String.valueOf(accNum).length();
		if(length>5 || length<5) {
			throw new invalidcustid("Invalid customer id ");

		}
	}
	
	

}

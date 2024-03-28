package address;

public class person {
	String name;
	int num;
	address adr; //aggregation
	public person(String name, int num, address adr) {
		super();
		this.name = name;
		this.num = num;
		this.adr = adr;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", num=" + num + ", adr=" + adr + "]";
	}
	
	public static void main(String[] args) {
		address ad=new address(null, 1, null) ;
		person p= new person("Ajay",22, ad );
		System.out.println(p);
	}

}

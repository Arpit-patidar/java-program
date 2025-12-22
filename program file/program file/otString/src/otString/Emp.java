package otString;

public class Emp {
	String name;
	double salary;
	int id;
	public Emp(String name,int id,double salary) {
		this.id= id ;
		this.name =name;
		this.salary = salary;
	}
	public String toString() {
		return "Emp :id "+ id+",Emp:salary "+ salary+",Emp : name "+ name;
	}
public static void main(String[] args) {
	Emp emp = new Emp("ram",101,60000);
	Emp emp2 = new Emp("sita",102,40000);
	System.out.println(emp);
	System.out.println(emp2);
}
}

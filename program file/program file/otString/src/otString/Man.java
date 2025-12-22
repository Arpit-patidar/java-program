package otString;

public class Man {
boolean job;
boolean gf;
boolean car;

Man(boolean job,boolean gf,boolean car){
	this.job= job;
	this.gf = gf;
	this.car =car;
}
public String toString() {
	return "Man [job :"+job+", gf :"+ gf+", car :"+ car+"]";
}
public static void main(String[] args) {
	Man b1 = new Man(true, true, false);
//	Bike b2 = new Bike("");
	System.out.println(b1);
}
}

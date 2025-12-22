package otString;

public class Bike {
String brand;
double price;
String color;
Bike(String brand,double price,String color){
	this.brand= brand;
	this.price = price;
	this.color =color;
}
public String toString() {
	return "Bike [brand :"+brand+", price :"+ price+", color :"+ color+"]";
}
public static void main(String[] args) {
	Bike b1 = new Bike("honda",200000,"red");
//	Bike b2 = new Bike("");
	System.out.println(b1);
}
}

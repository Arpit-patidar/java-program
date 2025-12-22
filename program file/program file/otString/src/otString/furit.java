package otString;

public class furit {
String name;
double price;
String color;
furit(String name,double price,String color){
	this.name= name;
	this.price = price;
	this.color =color;
}
public String toString() {
	return "furit [name :"+name+", price :"+ price+", color :"+ color+"]";
}
public static void main(String[] args) {
	furit b1 = new furit("apple",100,"red");
//	Bike b2 = new Bike("");
	System.out.println(b1);
}
}

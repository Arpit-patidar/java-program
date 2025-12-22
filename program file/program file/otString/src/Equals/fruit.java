package Equals;

import java.util.Objects;

public class fruit {
String name;
String color;
double price;
public fruit(String name,String color,double price) {
	this.color = color;
	this.name =name;
	this.price = price ;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	fruit other = (fruit) obj;
	return Objects.equals(color, other.color) && Objects.equals(name, other.name) && price ==other.price;
//			&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
}
public static void main(String[] args) {
	fruit f1 = new fruit("apple","red",100);
	fruit f2 = new fruit("apple","red",100);
//	fruit f2 = new fruit("mengo","yellow",120);
	System.out.println(f1.equals(f2));
}
}

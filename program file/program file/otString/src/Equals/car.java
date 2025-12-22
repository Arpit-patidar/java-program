package Equals;

import java.util.Objects;

public class car {
String brand;
String color;
double price;
car(String brand,String color,double price){
	this.brand = brand;
	this.price = price ;
	this.color =color;
}
@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (!(obj instanceof car)) {
		return false;
	}
	car other = (car) obj;
	return Objects.equals(brand, other.brand) && Objects.equals(color, other.color)
			&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
}
public static void main(String[] args) {
	car c1 = new  car("tata","red",10000000);
	car c2 = new car ("honda","black",12300);
	System.out.println(c1.equals(c2));
}
}

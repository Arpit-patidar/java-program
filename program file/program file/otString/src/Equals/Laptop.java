package Equals;

import java.util.Objects;

public class Laptop {
String brand;
String RAM;
double price;
public Laptop(String brand,String RAm,double price) {
	this.brand= brand;
	this.price =price;
	this.RAM =RAM;
}
@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (!(obj instanceof Laptop)) {
		return false;
	}
	Laptop other = (Laptop) obj;
	return Objects.equals(RAM, other.RAM) && Objects.equals(brand, other.brand)
			&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
}
public static void main(String[] args) {
	Laptop l1 = new Laptop("Dell", "128", 50000);
	Laptop l2 = new Laptop("Dell", "128",50000);
	System.out.println(l1.equals(l2));
}
}

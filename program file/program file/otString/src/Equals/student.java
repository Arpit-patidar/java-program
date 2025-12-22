package Equals;

import java.util.Objects;

public class student {
int id;
String name;
String branch;
public student(int id , String name,String branch) {
	this.id = id;
	this.name= name;
	this.branch= branch;
}
@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (!(obj instanceof student)) {
		return false;
	}
	student other = (student) obj;
	return Objects.equals(branch, other.branch) && id == other.id && Objects.equals(name, other.name);
}
public static void main(String[] args) {
	student s1 = new student(101, "ram", "cs");
	student s2 = new student(101, "ram", "cs");
	System.out.println(s1.equals(s2));
}
}

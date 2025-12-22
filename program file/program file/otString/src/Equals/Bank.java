package Equals;

import java.util.Objects;

public class Bank {
	String branch;
	double cash;
	String passbook;
	public Bank(String branch,String passbook,double cash) {
		this.branch =branch;
		this.cash = cash;
		this.passbook = passbook;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Bank)) {
			return false;
		}
		Bank other = (Bank) obj;
		return Objects.equals(branch, other.branch)
				&& Double.doubleToLongBits(cash) == Double.doubleToLongBits(other.cash)
				&& Objects.equals(passbook, other.passbook);
	}
	public static void main(String[] args) {
		Bank b1 = new Bank("deccan", null, 100);
		Bank b2 = new Bank("deccan", "SBI", 1000);
		System.out.println(b1.equals(b2));
	}

}

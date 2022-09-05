package com.spec.oopsjava_Encapsulation;

public class ConceptOfGetterSetter {
	private int pvt_number;
	private double pvt_balance;
	private String pvt_name;
	
	public int pub_number;
	public String pub_name;
	public double pub_balance;
	public ConceptOfGetterSetter(int pvt_number, double pvt_balance, String pvt_name, int pub_number, String pub_name,
			double pub_balance) {
		super();
		this.setPvt_number(pvt_number);
		this.setPvt_balance(pvt_balance);
		this.pvt_name = pvt_name;
		this.pub_number = pub_number;
		this.pub_name = pub_name;
		this.pub_balance = pub_balance;
	}
	public int getPvt_number() {
		return pvt_number;
	}
	public void setPvt_number(int pvt_number) {
		this.pvt_number = pvt_number;
		System.out.println("This is set value of data member "+pvt_number);
	}
	// this method sets the value declared in constructor of ConceptOfGetterSetter() in main class.
	public double getPvt_balance() {
		return pvt_balance;
	}
	public void setPvt_balance(double pvt_balance) {
		this.pvt_balance = pvt_balance;
	}
	public String getPvt_name() {
		return pvt_name;
	}
	public void setPvt_name(String pvt_name) {
		this.pvt_name = pvt_name;
	}
}

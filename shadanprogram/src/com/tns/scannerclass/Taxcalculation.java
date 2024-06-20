package com.tns.scannerclass;

public class Taxcalculation {

	public void calculation(Person p){
		
		if(p.getIncome()<=1600) {
			p.setTax(0);
		}
		else if(p.getIncome()>1600 && p.getIncome()<=15000)
		{
			p.setTax(5);
		}
		else {
			p.setTax(10);
		}
	}

	public void calculatetax(Person pp) {
		// TODO Auto-generated method stub
		
	}

}

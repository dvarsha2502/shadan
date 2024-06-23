package com.tns.inheritance;

public class Citizen {

	    private String name;
	    private long aadharno;
	    private String address;
	    private long phone;
	    
	    //default construction
	    public Citizen() {
	    	
	    }
	    //parameter
	    public Citizen(String name, long aadharno, String address, long phone) {
	    	super();
	    	this.name=name;
	    	this.aadharno=aadharno;
	    	this.address=address;
	    	this.phone=phone;
	    }
	    
	    //getter and setter
	    
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getAadharno() {
			return aadharno;
		}
		public void setAadharno(long aadharno) {
			this.aadharno = aadharno;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		@Override
		public String toString() {
			return "Citizen [name=" + name + ", aadharno=" + aadharno + ", address=" + address + ", phone=" + phone
					+ "]";
		}
		
	    
}

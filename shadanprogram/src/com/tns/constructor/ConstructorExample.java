package com.tns.constructor;
// demo constructor
public class ConstructorExample {

	ConstructorExample(){
		System.out.println("default constructor");
	}
	
	ConstructorExample(int i){
		System.out.println("constructor with 1 parameter");
	}
	ConstructorExample(int i,int j){
		System.out.println("constructor with 2 parameter");
	}
	ConstructorExample(String s,int i){
		System.out.println("constructor with diff datatype");
	}
	
	public static void main(String[] args) {
	        ConstructorExample e=new ConstructorExample ();
	        ConstructorExample e1=new ConstructorExample (2);
	        ConstructorExample e3=new ConstructorExample (3,5);
	        ConstructorExample e4=new ConstructorExample ("java",7);
    }
	
}	

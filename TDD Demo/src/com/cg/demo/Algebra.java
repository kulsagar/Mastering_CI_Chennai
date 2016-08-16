package com.cg.demo;

public class Algebra {

	public long factorial(long l){
		
		if(l<0){
			throw new IllegalArgumentException();
		}
		if(l==0 || l==1)
			return 1;
		
		long factorial=1;
		
		for(long x=l;x>=1;x--){
			
			factorial*=x;
		}
		
		return factorial;
	}
	

	public boolean isLeapYear(int year){
		
		if(year<0){
			throw new IllegalArgumentException();
		}
		if(!(year%4 == 0))
			return false;
		
		if(year%100==0){
			if(year%400==0){
				return true;
			}
			else{
				return false;
			}
		}
		return true;
		
		
	}
}












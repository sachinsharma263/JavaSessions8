package com.qa.inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		Bmw b=new Bmw();
		b.start();
		b.stop();
		b.tyreAirPressure();
		b.sunRoof();
		
		b.engine();
		
		//b.theftSafety();
		
		System.out.println("--------------");
		
		Car c=new Car();
		c.start();
		c.stop();
		c.tyreAirPressure();
		//c.sunRoof();
		
		c.engine();
		
		System.out.println("--------------");
		
		Car c2=new Bmw();
		c2.start();
		c2.stop();
		c2.tyreAirPressure();
		//c2.sunRoof();
		
		c2.engine();
		
		System.out.println("--------------");
		
		//Bmw b2=(Bmw) new Car();
		//b2.start();	
		
		System.out.println("--------------");
		
		Vehicle v=new Bmw();
		v.engine();
		
		//b.days=8;
		
	}

}

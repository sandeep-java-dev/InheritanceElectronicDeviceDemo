package p3;

import java.util.Scanner;

public class ClassAssignmentDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// scanf() / cin>>
		ClassAssignmentDemo operations = new ClassAssignmentDemo();
		while(true)
		{
			System.out.println("\n1. For Laptop");
			System.out.println("2. For Washing Machine");
			System.out.println("0 For Exit\n");
			
			int userChoice = sc.nextInt();
			
			switch(userChoice)
			{
				case 1: Laptop hpLaptop = new Laptop();
				operations.useMachine(hpLaptop);
			}
		}//end while
		
	}//end main
	                     ///  ElectronoicDevice device = new Laptop();
	public void useMachine(ElectronicDevices device)
	{
		System.out.println("\n-----------------------");
		device.doOn();  // laptop on
		device.consumePower(new CircuitBoard());
		device.doOff(); // laptop off
		
		// ----
		Laptop laptop = (Laptop)device;
		laptop.dataConnection(); // how to resolve this error
		// dataConnection is the method from Wifi Interface
	}
	
	
}

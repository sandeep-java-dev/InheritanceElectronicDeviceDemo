package p3;

public class Laptop extends ElectronicDevices 
   implements Bluetooth,Wifi
{

	@Override
	public void doOn() {
		System.out.println("Laptop ON");
		System.out.println("Booting .....");

	}

	@Override
	public void doOff() {
		// TODO Auto-generated method stub

		System.out.println("Laptop Off");
		System.out.println("Closing all applications....");
	}

	
	
	@Override
	public void dataConnection() {
		System.out.println("Wifi data connection On");
		
	}

	@Override
	public void connection() {
		System.out.println("Bluetooth connection On");
		
	}

	@Override
	public void consumePower(CircuitBoard cb) {
		// TODO Auto-generated method stub
		
		int cbpower = cb.getPower();
		// --- add laptop related code
		cbpower+=10;
		
		System.out.println("Laptop circuit board consume "+cbpower);

	}

}

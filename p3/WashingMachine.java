package p3;

public class WashingMachine extends ElectronicDevices{

	@Override
	public void doOn() {
		System.out.println(" Hard point Button for Machine On");
		
	}

	@Override
	public void doOff() {
		System.out.println(" Hard point Button for Machine Off");
		
	}

	@Override
	public void consumePower(CircuitBoard cb) {
		int cbpower = cb.getPower();
		// --- add washing Machine related code
		cbpower+=8489;
		
		System.out.println("Laptop circuit board consume "+cbpower);
		
	}

	
}

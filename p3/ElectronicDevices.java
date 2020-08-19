package p3;

abstract public class ElectronicDevices {

	
	public abstract void doOn();  // represent cab/bike on google map
	public abstract void doOff();
	public abstract void consumePower(CircuitBoard cb);
	
	public void timer(int timerValue) // 10  // code of using google map
	{
		if(timerValue == 0)
		{
			System.out.println("Mchine Off");
			this.doOff();
		}
		else timerValue--;
	}
	
}

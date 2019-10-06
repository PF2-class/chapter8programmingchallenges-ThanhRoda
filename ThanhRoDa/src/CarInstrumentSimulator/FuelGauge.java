package CarInstrumentSimulator;

public class FuelGauge {
	static int amountFuel;

	public int getAmountFuel() {
		return amountFuel;
	}

	public void setAmountFuel(int amountFuel) {
		FuelGauge.amountFuel = amountFuel;
	}
    public static void Increment() {
    	if (amountFuel <15 )
    		amountFuel ++;
    }
    public static void Decrement() {
    	if (amountFuel >0 )
    		amountFuel --;
    }
    public void showFuel() {
    	System.out.println("Fuel: "+getAmountFuel());
    }
    
}

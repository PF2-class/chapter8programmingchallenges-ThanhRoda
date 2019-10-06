package CarInstrumentSimulator;

public class InstrumentSimulatorDemo {

	public static void main(String[] args) {
		FuelGauge f = new FuelGauge();
		f.setAmountFuel(15);
		Odometer.setMileage(0);
		for (int i = 0; i>=0 ; i++) {
			Odometer.IncrementMiles();
			Odometer.travedMiles(f);
			Odometer.ShowMiles();
			f.showFuel();
			if(f.getAmountFuel() == 0)
				return;
			
		}
		
	}

}

package CarInstrumentSimulator;

public class Odometer {
	static int mileage;
		FuelGauge fue;
	public static int getMileage() {
		return mileage;
	}
	public static void setMileage(int mileage) {
		Odometer.mileage = mileage;
	}
	public static void IncrementMiles() {
		if (mileage < 0 || mileage > 999999)
			mileage = 0;
		else
			mileage++;
	}
	public static void travedMiles(FuelGauge f) {
		if (mileage % 24 == 0)
			FuelGauge.Decrement();
	}
	public static void ShowMiles() {
		System.out.println("Mile: "+getMileage());
	}

}

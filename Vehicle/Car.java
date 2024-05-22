package Vehicle;

public class Car extends Master{
	private String FuelType;
	public Car(int model, int engine, String color, String fuelType) {
		super(model, engine, color);
		FuelType = fuelType;
	}
	void Carout() {
		//super.Masterout();
		System.out.println("FuelType="+FuelType);
	}

}

package Vehicle;

public class Bus extends Master{
	private int capacity;
	
	public Bus(int model, int engine, String color, int capacity) {
		super(model, engine, color);
		this.capacity = capacity;
	}
	void Busout() {
		//super.Masterout();
		System.out.println("Capacity="+capacity);
	}

}

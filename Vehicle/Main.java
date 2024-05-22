package Vehicle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Master vehicle=new Master(2010,999,"red");
		//System.out.println(vehicle.toString());
		vehicle.Masterout();
		Bike b=new Bike(2010,888,"yellow","Sports");
		//System.out.println(b.toString());
		b.Bikeout();
		Car c=new Car(2002,555,"blue","petrol");
		c.Carout();
		Bus bu=new Bus(2001,222,"green",100);
		bu.Busout();

	}

}


package Hospital;

public class Doctor extends Person {
	String docspecial;

	public Doctor(String name, int age, String gender, String docspecial) {
		super(name, age, gender);
		this.docspecial = docspecial;
	}
	void docout() {
		super.Personout();
		System.out.println("Speciality:"+this.docspecial);
		
	}

}

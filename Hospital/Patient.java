package Hospital;

public class Patient extends Person {
	int bedno;
	String disease;
	public Patient(String name,int age, String gender, int bedno, String disease) {
		super(name,age,gender);
		this.bedno = bedno;
		this.disease = disease;
	}
	void Patientout() {
		super.Personout();
		System.out.println("Bed number:"+this.bedno);
		System.out.println("Disease name:"+this.disease);
	}
	

}


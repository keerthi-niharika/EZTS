
package Hospital;

public class Nurse extends Person {
int floorno,patientallocated,rno;

public Nurse(String name, int age, String gender, int floorno, int patientallocated, int rno) {
	super(name, age, gender);
	this.floorno = floorno;
	this.patientallocated = patientallocated;
	this.rno = rno;
}
void Nurseout() {
	super.Personout();
	System.out.println("Room number:"+this.rno);
	System.out.println("Floor number:"+this.floorno);
	System.out.println("Number of patients allocated:"+this.patientallocated);
}
}

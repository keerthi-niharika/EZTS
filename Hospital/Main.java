
package Hospital;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n,gender,disease,docsp;
		int old,bno,fno,pall,room;
		int s;
		System.out.println("Enter 1 for doctor details\nEnter 2 for patient details \nEnter 3 for nurse details");
		s=sc.nextInt();
		switch(s)
		{
		case 1: 
		 System.out.println("Enter Name:");
		 n=sc.next();
		 System.out.println("Enter Age:");
		 old=sc.nextInt();
		 System.out.println("Enter Gender:");
		 gender=sc.next();
		 System.out.println("Enter speciality:");
		 docsp=sc.next();
		 Doctor d=new Doctor(n,old,gender,docsp);
		 System.out.println("Doctor Details : ");
		 d.docout();
		 break;
		 
		case 2: 
			 System.out.println("Enter Name:");
			 n=sc.next();
			 System.out.println("Enter Age:");
			 old=sc.nextInt();
			 System.out.println("Enter Gender:");
			 gender=sc.next();
			 System.out.println("Enter bed number:");
			 bno=sc.nextInt();
			 System.out.println("Enter disease:");
			 disease=sc.next();
			 Patient p=new Patient(n,old,gender,bno,disease);
			 System.out.println("Patient Details :");
			 p.Patientout();
			 break;
			 
		case 3: 
			 System.out.println("Enter Name:");
			 n=sc.next();
			 System.out.println("Enter Age:");
			 old=sc.nextInt();
			 System.out.println("Enter Gender:");
			 gender=sc.next();
			 System.out.println("Enter floor number:");
			 fno=sc.nextInt();
			 System.out.println("Enter patients allocated:");
			 pall=sc.nextInt();
			 System.out.println("Enter room number:");
			 room=sc.nextInt();
			 Nurse nu=new Nurse(n,old,gender,fno,pall,room);
			 System.out.println("Patient Details");
			 nu.Nurseout();
			 break;
		default:
			System.out.println("Invalid input,please enter valid input.");


		}
	}

}

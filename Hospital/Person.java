
package Hospital;

public class Person {
	int age;
	String name,gender;
	public Person(String name,int age, String gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	void Personout()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Gender:"+this.gender);
	}

}

package banking;

public class Person {
	private String firstName;
	private String lastName;
	private int idNumber;

	public Person(String firstName, String lastName, int idNumber) {
		// complete the function

		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;


	}

	public String getFirstName() {
		// complete the function
        return this.firstName;
	}

	public String getLastName() {
		// complete the function
        return this.lastName;
	}

	public int getIdNumber() {
		return this.idNumber;
	}
}

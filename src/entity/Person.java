package entity;



public abstract class Person {
	
	private String firstName;
	private String surname;
	private int day;
	private int month;
	private int year;
	private String naturality;
	private String gender;
	
	
	

	public Person(String firstName, String surname, int day, int month, int year, String naturality, String gender) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.day = day;
		this.month = month;
		this.year = year;
		this.naturality = naturality;
		this.gender = gender;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	

}

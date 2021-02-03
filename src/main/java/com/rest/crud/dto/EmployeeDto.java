package com.rest.crud.dto;

public class EmployeeDto {


	
	private int Id;

	private String FirstName;

	private String LastName;

	private String EmailId	;	

	private String Age;
	
	private String Gender;

	private String Address;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public EmployeeDto() {
		super();
	}

	public EmployeeDto(int id, String firstName, String lastName, String emailId, String age, String gender,
			String address) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		EmailId = emailId;
		Age = age;
		Gender = gender;
		Address = address;
	}

	

}

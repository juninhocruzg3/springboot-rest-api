package com.juninhocruz.educationalplanner;

import java.util.Date;
import java.util.UUID;

public class Trainee {
	private UUID id;
	private String firstName, lastName;
	private int age;
	private String profession;
	private String email, address, gender;
	private TraineeStatus status;
	private Date startAt, endAt;
	
	public Trainee() {
		super();
	}
	
	public Trainee(UUID id, String firstName, String lastName, int age, String profession, String email, String address,
			String gender, TraineeStatus status, Date startAt, Date endAt) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.profession = profession;
		this.email = email;
		this.address = address;
		this.gender = gender;
		this.status = status;
		this.startAt = startAt;
		this.endAt = endAt;
	}

	public Trainee(String firstName, String lastName, int age, String profession, String email, String address,
			String gender, TraineeStatus status, Date startAt, Date endAt) {
		this(
				UUID.randomUUID(), firstName, lastName, age, profession, email,
				address, gender, status, startAt, endAt
		);
	}
	
	public Trainee(String firstName, String lastName, int age, String profession, String email, String address,
			String gender) {
		this(firstName, lastName, age, profession, email, address, gender, TraineeStatus.DEFAULT, new Date(), null);
	}

	public Trainee(String firstName, String lastName) {
		this(firstName, lastName, -1, null, null, null, null);
	}
	
	public String getFullName() {
		return this.getFirstName() + " " + this.getLastName(); 
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public TraineeStatus getStatus() {
		return status;
	}
	public void setStatus(TraineeStatus status) {
		this.status = status;
	}
	public Date getStartAt() {
		return startAt;
	}
	public void setStartAt(Date startAt) {
		this.startAt = startAt;
	}
	public Date getEndAt() {
		return endAt;
	}
	public void setEndAt(Date endAt) {
		this.endAt = endAt;
	}
	
	
}

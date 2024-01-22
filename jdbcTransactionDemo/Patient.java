package jdbcTransactionDemo;

import java.util.Random;

public class Patient {
	private int patient_id;
	private String patient_name;
	private int age;
	private String gender;
	
	public Patient() {
		super();
	}
 
	public Patient(String name, int age, String gender) {
		super();
		this.patient_id = new Random().nextInt(10);
		this.patient_name = name;
		this.age = age;
		this.gender = gender;
	}
 
	public int getPatient_id() {
		return patient_id;
	}
 
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
 
	public String getName() {
		return patient_name;
	}
 
	public void setName(String name) {
		this.patient_name = name;
	}
 
	public int getAge() {
		return age;
	}
 
	public void setAge(int age) {
		this.age = age;
	}
 
	public String getGender() {
		return gender;
	}
 
	public void setGender(String gender) {
		this.gender = gender;
	}
 
	@Override
	public String toString() {
		return "Patient [patient_id=" + patient_id + ", name=" + patient_name + ", age=" + age + ", gender=" + gender
				 + "]";
	}
}
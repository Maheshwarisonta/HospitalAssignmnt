package jdbcTransactionDemo;

import java.util.Random;

public class Doctor {
	private int doctor_id;
	private String patient_name;
	private String specialization;
 
	public Doctor() {
		super();
	}
 
	public Doctor(String name, String specialization) {
		super();
		this.doctor_id = new Random().nextInt(10);
		this.patient_name = name;
		this.specialization = specialization;
	}
 
	public int getDoctor_id() {
		return doctor_id;
	}
 
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
 
	public String getName() {
		return patient_name;
	}
 
	public void setName(String name) {
		this.patient_name = name;
	}
 
	public String getSpecialization() {
		return specialization;
	}
 
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	@Override
	public String toString() {
		return "Doctor [doctor_id=" + doctor_id + ", name=" + patient_name + ", specialization=" + specialization
				+ "]";
	}
}
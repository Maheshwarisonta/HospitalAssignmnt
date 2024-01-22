package jdbcTransactionDemo;

public class Appointment {
	private int appointment_id;
	private int patient_id;
	private int doctor_id;
	private String status;
	
	private static int auto_generateId = 0;
 
	public Appointment() {
		super();
		this.appointment_id = ++ auto_generateId;
	}
 
	public Appointment(int appointment_id, int patient_id, int doctor_id, String status) {
		super();
		this.appointment_id = appointment_id;
		this.patient_id = patient_id;
		this.doctor_id = doctor_id;
		this.status = status;
	}
 
	public int getAppointment_id() {
		return appointment_id;
	}
 
	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
	}
 
	public String getStatus() {
		return status;
	}
 
	public void setStatus(String status) {
		this.status = status;
	}
 
	public int getPatient_id() {
		return patient_id;
	}
 
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
 
	public int getDoctor_id() {
		return doctor_id;
	}
 
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
 
	@Override
	public String toString() {
		return "Appointment [appointment_id=" + appointment_id + ", patient_id=" + patient_id + ", doctor_id="
				+ doctor_id + ", status=" + status + "]";
	}

}

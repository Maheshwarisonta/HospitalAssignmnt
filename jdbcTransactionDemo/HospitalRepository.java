package jdbcTransactionDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HospitalRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int getCountOfAppointments(int doctor_id) {
		String sql = "select count(appointment_id) from appointment where doctor_id = " + doctor_id;
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}
	
	public void save(Appointment appointment) {
		String sql = "insert into appointment values(?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] {appointment.getAppointment_id(), appointment.getDoctor_id(), appointment.getPatient_id(), appointment.getStatus()});
	}
}

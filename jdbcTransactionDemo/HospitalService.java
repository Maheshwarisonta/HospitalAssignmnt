package jdbcTransactionDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HospitalService {
	@Autowired
	private HospitalRepository repo;
	
	@Transactional//(propagation = Propagation.REQUIRED)
	public void save(Appointment appointment) throws Exception {
		
		if(repo.getCountOfAppointments(appointment.getDoctor_id()) <3)
			repo.save(appointment);
		else
			throw new Exception("Appointment not Scheduled");
	}
 
}
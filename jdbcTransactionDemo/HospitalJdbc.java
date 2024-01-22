package jdbcTransactionDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HospitalJdbc {
	public static void main(String args[]) {
		
		 AnnotationConfigApplicationContext context =
	        		new AnnotationConfigApplicationContext(BeanConfig.class);
	    	context.registerShutdownHook();
	        
	        HospitalService service = context.getBean(HospitalService.class);
	        
	        Appointment appointment = new Appointment();
	        try {
	        service.save(appointment);
	        System.out.println("Appointment Scheduled");
	        }catch(Exception ex) {
	        	System.out.println("Rollback Happend because : " + ex.getMessage());
	        }
	        context.close();       
	}	
}
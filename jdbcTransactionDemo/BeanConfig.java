package jdbcTransactionDemo;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
 
@Configuration
@ComponentScan(basePackages = "jdbcTransactionDemo")
@EnableTransactionManagement
public class BeanConfig {
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
	
	@Bean
	public DataSource dataSource() {
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/hospitalmanagement",
				"root", "Admin@123" );
	}
	@Bean
	public Appointment appointment() {
		return new Appointment();
	}
	@Bean
	public HospitalRepository hospitalRepository() {
		return new HospitalRepository();
	}
	@Bean
	public TransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
}

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.springcourse"})
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer()
	{
		return new PropertySourcesPlaceholderConfigurer();
	}
	/*
	 * @Bean(name="customerService") public CustomerService getCustomerService() {
	 * CustomerServiceImp service=new CustomerServiceImp();
	 * //service.setCustomerRepositary(getCustomerRepositary()); return service; }
	 */
	
	/*
	@Bean(name="customerRepositary")
	public CustomerRepositary getCustomerRepositary()
	{
		return new CustomerRepositaryImp();
	}*/

}

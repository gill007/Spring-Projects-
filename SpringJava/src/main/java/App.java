

import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcourse.Service.CustomerService;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService service=appContext.getBean("customerService",CustomerService.class);
        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service);
        
        CustomerService service1=appContext.getBean("customerService",CustomerService.class);
        System.out.println(service1.findAll().get(0).getFirstName());
        System.out.println(service1);
    }
}

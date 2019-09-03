package com.springcourse.SpringFundamental;

import com.springcourse.Service.CustomerService;
import com.springcourse.Service.CustomerServiceImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CustomerService cs=new CustomerServiceImp();
        
        System.out.println(cs.findAll().get(0).getFirstName());
        
    }
}

package com.springcourse.repositary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.springcourse.model.Customer;

public class CustomerRepositaryImp implements CustomerRepositary {
   @Value("${dbUsername}")
	String dbUsername;
	
	

	

	public List<Customer> findAll() {
		System.out.println(dbUsername);
		List<Customer> ls = new ArrayList();
		Customer c = new Customer();

		c.setFirstName("Adesh");
		c.setLastName("Gill");

		ls.add(c);
		return ls;

	}

}

package com.springcourse.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcourse.model.Customer;
import com.springcourse.repositary.CustomerRepositary;

@Service("customerService")
public class CustomerServiceImp implements CustomerService {
	
	//@Autowired
	private CustomerRepositary customerRepositary; 
	
	public CustomerRepositary getCustomerRepositary() {
		return customerRepositary;
	}

	@Autowired
	public void setCustomerRepositary(CustomerRepositary customerRepositary) {
		System.out.println("Setter Injection");
		this.customerRepositary = customerRepositary;
	}

	public List<Customer> findAll()
	{
		return customerRepositary.findAll();
	}

	

}

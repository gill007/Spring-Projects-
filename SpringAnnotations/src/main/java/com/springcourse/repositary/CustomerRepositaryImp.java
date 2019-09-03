package com.springcourse.repositary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springcourse.model.Customer;

@Repository("customerRepositary")
public class CustomerRepositaryImp implements CustomerRepositary {

	public List<Customer> findAll() {
		List<Customer> ls = new ArrayList();
		Customer c = new Customer();

		c.setFirstName("Adesh");
		c.setLastName("Gill");

		ls.add(c);
		return ls;

	}

}

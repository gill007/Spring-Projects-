package com.springcourse.repositary;

import java.util.List;

import com.springcourse.model.Customer;

public interface CustomerRepositary {

	List<Customer> findAll();

}
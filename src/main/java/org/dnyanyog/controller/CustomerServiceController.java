package org.dnyanyog.controller;

import org.dnyanyog.dto.CustomerRequest;
import org.dnyanyog.dto.CustomerResponse;
import org.dnyanyog.service.CustomerService;
import org.dnyanyog.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
@RestController
public class CustomerServiceController
{
	@Autowired
	CustomerServiceImpl customerServiceImpl;

	@PostMapping(path = "/api/v1/customer/add", consumes = { "application/json", "application/xml" }, produces = {
			"application/json", "application/xml" })
	public CustomerResponse addCustomerDetails(@Valid @RequestBody CustomerRequest request) {
		return customerServiceImpl.addCustomerDetails(request);
	}

	@PostMapping(path = "/api/v1/customer/update/{id}", consumes = { "application/json",
			"application/xml" }, produces = { "application/json", "application/xml" })
	public CustomerResponse update(@PathVariable long id, @RequestBody CustomerRequest request) {
		return customerServiceImpl.updateCustomerDetails(id, request);
	}

	@GetMapping(path = "/api/v1/customer/search/{mobile_number}")
	public CustomerResponse searchCustomerByMobileNumber(String mobile_number) {
		return customerServiceImpl.findByMobileNumber(mobile_number);
	}

}

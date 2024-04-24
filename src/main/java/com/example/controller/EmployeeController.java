package com.example.controller;

import com.example.dto.Employee;
import com.example.jms.EmpProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	EmpProducer empProducer;

	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public void saveEmployee(@RequestBody Employee employee) {
		empProducer.sendMessage(employee);
	}
}

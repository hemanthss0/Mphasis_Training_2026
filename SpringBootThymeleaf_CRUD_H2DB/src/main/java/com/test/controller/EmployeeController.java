package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.entity.Employee;
import com.test.repository.EmployeeRepositry;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/employees/")
public class EmployeeController {
	private final EmployeeRepositry employeeRepositry;
	@Autowired
	public EmployeeController(EmployeeRepositry employeeRepositry) {
		this.employeeRepositry= employeeRepositry;
	}
	@GetMapping("signup")
	public String showSignUpForm(Employee employee) {
	return "add-employee";
	}
	
	@GetMapping("list")
	public String showUpdateForm(Model model) {
		model.addAttribute("employees",employeeRepositry.findAll());
		
		return "index";
	}
	@PostMapping("add")
	public String addEmployee(@Valid Employee employee, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "add-employee";
		}
		employeeRepositry.save(employee);
		return "redirect:list";
	}
	@GetMapping("edit/{id}")
	public String showUpdateForm(@PathVariable long id, Model model) {
		Employee employee = employeeRepositry.findById(id).orElseThrow(
				() -> new IllegalArgumentException("invalid employee id : "+id)
				);
		model.addAttribute("employee",employee);
		return "update-employee";
	}
	@PostMapping("update/{id}")
	public String updateEmployee(@PathVariable long id,
						@Valid Employee employee,
						BindingResult result, Model model) {
		if(result.hasErrors()) {
			employee.setId(id);
			return "update-employee";
		}
		
		employeeRepositry.save(employee);
		model.addAttribute("employees",employeeRepositry.findAll());
		return "index";
	}
	@GetMapping("delete/{id}")
	public String deleteEmployee(@PathVariable long id, Model model) {
		Employee employee= employeeRepositry.findById(id)
										.orElseThrow(() -> new IllegalArgumentException("invalid employee id"+id));
										
       employeeRepositry.deleteById(id);
       model.addAttribute("employees",employeeRepositry.findAll());
       return "index";
	}
}

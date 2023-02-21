package com.enoca.task.service;

import com.enoca.task.entity.Company;
import com.enoca.task.entity.Employee;
import com.enoca.task.entity.request.EmployeeCreateRequest;
import com.enoca.task.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final CompanyService companyService;

    public EmployeeService(EmployeeRepository employeeRepository, CompanyService companyService) {
        this.employeeRepository = employeeRepository;
        this.companyService = companyService;
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).orElseThrow(()->new RuntimeException("Employee Not Foud!"));
    }

    public Employee createEmployee(EmployeeCreateRequest request){
        Company company = companyService.getCompanyById(request.getCompanyId());
        Employee newEmployee = new Employee(request.getName(), request.getLastName(), company);
        return employeeRepository.save(newEmployee);
    }

    public Employee updateEmployeeById(Long id, EmployeeCreateRequest request){

        Employee existEmployee = getEmployeeById(id);
        Company company = companyService.getCompanyById(request.getCompanyId());

        existEmployee.setName(request.getName());
        existEmployee.setLastName(request.getLastName());
        existEmployee.setCompany(company);

        return employeeRepository.save(existEmployee);
    }

    public String deleteEmployeeById(Long id){
        employeeRepository.delete(getEmployeeById(id));
        return "deleted employee with id: " +id;
    }

}

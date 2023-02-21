package com.enoca.task.config;

import com.enoca.task.entity.Company;
import com.enoca.task.entity.Employee;
import com.enoca.task.repository.CompanyRepository;
import com.enoca.task.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final CompanyRepository companyRepository;
    private final EmployeeRepository employeeRepository;

    public DataLoader(CompanyRepository companyRepository, EmployeeRepository employeeRepository) {
        this.companyRepository = companyRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Company company = null;
        Employee employee = null;

        for (int i = 0; i < 10; i++) {
            company = new Company("company"+i);
            companyRepository.save(company);
        }

        List<Company> companies = companyRepository.findAll();

        for (int i = 0; i < 10; i++) {
            employee = new Employee("name "+i,"lastname "+i, companies.get(1));
            employeeRepository.save(employee);
        }

    }
}

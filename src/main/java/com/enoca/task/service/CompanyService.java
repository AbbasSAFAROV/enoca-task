package com.enoca.task.service;

import com.enoca.task.entity.Company;
import com.enoca.task.entity.request.CompanyCreateRequest;
import com.enoca.task.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> getAllCompanies(){
        return companyRepository.findAll();
    }

    public Company getCompanyById(Long id){
        return companyRepository.findById(id).orElseThrow(()->new RuntimeException("Company not foud!"));
    }

    public Company createCompany(CompanyCreateRequest request){
        return companyRepository.save(new Company(request.getName()));
    }

    public Company updateCompanyById(Long id, CompanyCreateRequest request){
        Company company = getCompanyById(id);
        company.setCompanyName(request.getName());
        return companyRepository.save(company);
    }

    public String deleteCompanyById(Long id){
        companyRepository.delete(getCompanyById(id));
        return "Company deleted with id: "+id;
    }

}

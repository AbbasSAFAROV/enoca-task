package com.enoca.task.controller;


import com.enoca.task.entity.Company;
import com.enoca.task.entity.request.CompanyCreateRequest;
import com.enoca.task.service.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public ResponseEntity<List<Company>> getAllCompanies(){
        return new ResponseEntity<>(companyService.getAllCompanies(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> getCompanyById(@PathVariable Long id){
        return new ResponseEntity<>(companyService.getCompanyById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Company> createCompany(@RequestBody CompanyCreateRequest request){
        return new ResponseEntity<>(companyService.createCompany(request),HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Company> updateCompanyById(@PathVariable Long id, @RequestBody CompanyCreateRequest request){
        return new ResponseEntity<>(companyService.updateCompanyById(id,request), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCompanyById(@PathVariable Long id){
        return new ResponseEntity<>(companyService.deleteCompanyById(id), HttpStatus.OK);
    }


}

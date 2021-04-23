package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SearchFacade {
  
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> findEmployee(String letters) throws EmployeeNotFoundException {
        LOGGER.info("employee finding by letters: " + letters);
        return Optional.ofNullable(employeeDao.findUserByAnyLetters(letters))
                .orElseThrow(()->new EmployeeNotFoundException(EmployeeNotFoundException.EMP_NOT_FOUND));
    }

    public List<Company> findCompany(String letters) throws CompanyNotFoundException{
        LOGGER.info("company finding by letters: " + letters);
        return Optional.ofNullable(companyDao.findByAnyLetters(letters))
                .orElseThrow(()->new CompanyNotFoundException(CompanyNotFoundException.COMPANY_NOT_FOUND));
    }
}

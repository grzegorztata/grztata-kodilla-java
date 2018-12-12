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

@Service
public class Facade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public List<Company> searchComapnyByPartOfName(String arg) {
        LOGGER.info("Searching Company by part of Name: " + "[" + arg + "]");
        return companyDao.retrieveCompanyByPartOfName(arg);
    }

    public List<Employee> searchEmployeeByPartOfName(String partOfLastname) {
        LOGGER.info("Searching Employee by part of LastName: " + "[" + partOfLastname + "]");
        return employeeDao.retrieveEmployeeByPartOfName(partOfLastname);
    }
}

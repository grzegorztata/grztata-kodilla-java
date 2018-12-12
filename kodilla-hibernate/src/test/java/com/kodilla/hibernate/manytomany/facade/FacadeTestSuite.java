package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    Facade facade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testCompanyFacade() {
        //Given
        Company firstCompany = new Company("First Company");
        Company secondCompany = new Company("Second Company ");
        Company thirdCompany = new Company("Blabla Company");

        //When
        companyDao.save(firstCompany);
        int firstCompanyId = firstCompany.getId();
        companyDao.save(secondCompany);
        int secondCompanyId = secondCompany.getId();
        companyDao.save(thirdCompany);
        int thirdCompanyId = thirdCompany.getId();
        List<Company> searchedCompanies = facade.searchComapnyByPartOfName("bla");

        //Then
        assertEquals(1, searchedCompanies.size());

        //Clean up
        try {
            companyDao.delete(firstCompanyId);
            companyDao.delete(secondCompanyId);
            companyDao.delete(thirdCompanyId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testEmployeeFacade() {
        //Given
        Employee firstJeden = new Employee("Jedynka", "Jeden");
        Employee twoDwa = new Employee("Two", "Dwa");
        Employee threeTrzy = new Employee("Three", "Trzy");

        //When
        employeeDao.save(firstJeden);
        int firstJedenId = firstJeden.getId();
        employeeDao.save(twoDwa);
        int twoDwaId = twoDwa.getId();
        employeeDao.save(threeTrzy);
        int threeTrzyId = threeTrzy.getId();

        List<Employee> searchedByName = facade.searchEmployeeByPartOfName("jedy");
        List<Employee> searchedBySurname = facade.searchEmployeeByPartOfName("d");

        //Then
        assertEquals(0, searchedByName.size()); //szukamy po Lastname więc 0
        assertEquals(2, searchedBySurname.size());

        //Clean Up
        try {
            employeeDao.delete(firstJedenId);
            employeeDao.delete(twoDwaId);
            employeeDao.delete(threeTrzyId);
        } catch (Exception e) {
            //do nothing
        }
    }
}

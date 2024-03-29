package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SearchFacadeTestSuite {

    @Autowired
    private SearchFacade searchFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    Employee janKowalski = new Employee("Jan", "Kowalski");
    Company greatCompany = new Company("Great Company");

    @BeforeEach
    void beforeEveryTest() {
        greatCompany.getEmployees().add(janKowalski);
        janKowalski.getCompanies().add(greatCompany);
    }

    @Test
    void testFindCompanyByPartOfName() throws SearchException {

        //Given
        companyDao.save(greatCompany);

        //When
        List<Company> companies = searchFacade.searchCompanyByPartOfName("reat");

        //Then
        assertEquals("Great Company", companies.get(0).getName());

        //CleanUp
        companyDao.deleteById(greatCompany.getId());
    }

    @Test
    void testFindCompanyException() throws SearchException {

        //Given
        companyDao.save(greatCompany);

        //When & Then
        assertDoesNotThrow(() -> searchFacade.searchCompanyByPartOfName("reat"));

        //CleanUp
        companyDao.deleteById(greatCompany.getId());
    }

    @Test
    void testFindEmployeeByPartOfName() throws SearchException {

        //Given
        employeeDao.save(janKowalski);

        //When
        List<Employee> employees = searchFacade.searchEmployeeByPartOfName("owa");

        //Then
        assertEquals("Jan", employees.get(0).getFirstname());
        assertEquals("Kowalski", employees.get(0).getLastname());

        //CleanUp
        employeeDao.deleteById(janKowalski.getId());
    }

    @Test
    void testFindEmployeeException() throws SearchException {

        //Given
        employeeDao.save(janKowalski);

        //When & Then
        assertDoesNotThrow(() -> searchFacade.searchEmployeeByPartOfName("owa"));

        //CleanUp
        employeeDao.deleteById(janKowalski.getId());
    }
}

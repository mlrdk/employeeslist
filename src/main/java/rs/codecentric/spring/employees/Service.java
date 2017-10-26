package rs.codecentric.spring.employees;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private EmployeesRepository employeesRepository;

    public List getAllEmployees(){
        List employees = new ArrayList<>();
        employeesRepository.findAll().forEach(employees::add);

        return employees;
    }

    public Employees getEmployees(String name){
        return employeesRepository.findOne(name);
    }



    public void addName(Employees employees) {
        employeesRepository.save(employees);
    }



}

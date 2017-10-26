package rs.codecentric.spring.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/names")
public class Controller {
    @Autowired
    private Service service;

    @RequestMapping( method = RequestMethod.GET)
    public List getAllNames(){
        return service.getAllEmployees();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addName(@RequestBody Employees employees){
        service.addName(employees);
    }


    }



package com.dynamic.map.com.dynamicmap.map.web;


import org.springframework.web.bind.annotation.*;

import com.dynamic.map.com.dynamic.map.model.Employee;


/**
 * Created by slava.birfir on 3/27/16.
 */
@RestController
@RequestMapping("map")
public class MainController {

   Employee employee = new Employee();

    @RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = "application/json")
    public Employee getEmployeeInJSON(@PathVariable String name) {

        employee.setName(name);
        employee.setEmail("employee1@genuitec.com");

        return employee;

    }

    @RequestMapping(value = "/{name}.xml", method = RequestMethod.GET, produces = "application/xml")
    public Employee getEmployeeInXML(@PathVariable String name) {

        employee.setName(name);
        employee.setEmail("employee1@genuitec.com");

        return employee;

    }


}

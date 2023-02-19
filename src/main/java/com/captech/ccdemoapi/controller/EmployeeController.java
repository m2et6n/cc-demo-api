package com.captech.ccdemoapi.controller;

import com.captech.ccdemoapi.model.EmployeeRecord;
import com.captech.ccdemoapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService ;

    @GetMapping("/employees")
    public List<EmployeeRecord> employees() {
    //public ResponseEntity<String> employees() {
        //return ResponseEntity.status(HttpStatus.OK).header("status", "completed").body(employeeService.getEmployees().toString()) ;
        return employeeService.getEmployees() ;
    }
}

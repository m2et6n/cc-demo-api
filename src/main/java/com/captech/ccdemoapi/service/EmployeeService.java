package com.captech.ccdemoapi.service;

import com.captech.ccdemoapi.dao.EmployeeDao;
import com.captech.ccdemoapi.model.EmployeeRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDao employeeDao ;

    public List<EmployeeRecord> getEmployees() {
        return employeeDao.getAllEmployees() ;
    }
}

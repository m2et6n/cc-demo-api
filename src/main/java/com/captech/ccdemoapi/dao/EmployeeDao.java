package com.captech.ccdemoapi.dao;

import com.captech.ccdemoapi.model.EmployeeRecord;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDao {

    public List<EmployeeRecord> getAllEmployees() {
        List<EmployeeRecord> employees = new ArrayList<>() ;

        employees.add(new EmployeeRecord(1, "Mike", "Thomason", "Manager")) ;
        employees.add(new EmployeeRecord(2, "Ted", "Dangerfield", "Director")) ;

        return employees ;
    }
}

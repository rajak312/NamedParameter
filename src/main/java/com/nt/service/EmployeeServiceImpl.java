package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO dao;
	@Override
	public String simpleInsert(Employee emp) {
		// TODO Auto-generated method stub
		int count=dao.insert(emp);
		return count==0?"Registration Failed ":"Employee "+emp.getEname()+" Registered Successfully";
	}

	

}

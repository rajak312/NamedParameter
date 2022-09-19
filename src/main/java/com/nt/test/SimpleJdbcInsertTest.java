package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.model.Employee;
import com.nt.service.EmployeeServiceImpl;

public class SimpleJdbcInsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		EmployeeServiceImpl service=ctx.getBean("empService",EmployeeServiceImpl.class);
		Employee emp=new Employee(1760,"Rajendra","Engineer",1900.08f,40);
        try {
        	System.out.println(service.simpleInsert(emp));
        }catch(DataAccessException dae) {
        	dae.printStackTrace();
        }
	}

}

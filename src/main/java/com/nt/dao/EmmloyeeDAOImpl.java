package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDao")
public class EmmloyeeDAOImpl implements IEmployeeDAO {
	
	@Autowired
	private SimpleJdbcInsert sji;

	@Override
	public int insert(Employee emp) {
		// TODO Auto-generated method stub
		sji.setTableName("emp");
		BeanPropertySqlParameterSource source=new BeanPropertySqlParameterSource(emp);
		int count=sji.execute(source);
		return count;
	}

	
	/*@Override 
	public int insert(Employee emp) { // TODO Auto-generated method
	   sji.setTableName("emp"); MapSqlParameterSource source=new
	   MapSqlParameterSource(); source.addValue("empno", emp.getEmpno());
	   source.addValue("ename",emp.getEname()); source.addValue("job",emp.getJob());
	   source.addValue("sal",emp.getSal());
	   source.addValue("deptno",emp.getDeptno()); int count=sji.execute(source);
	   return count; 
	}*/
	 

	/*
	 * @Override public int insert(Employee emp) { // TODO Auto-generated method
	 * stub sji.setTableName("emp"); Map<String,Object> callMap=Map.of("empno",
	 * emp.getEmpno(),"ename",emp.getEname(), "job",emp.getJob(),
	 * "sal",emp.getSal(),"deptno",emp.getDeptno()); int count
	 * =sji.execute(callMap); return count; }
	 */

}

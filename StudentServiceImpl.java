package com.wipro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.SessionFactoryUtils;

import com.wipro.bean.StudentBean;
import com.wipro.dao.StudentDao;

public class StudentServiceImpl implements StudentService {

	
	@Autowired
	StudentDao studentdao;
	
	@Override
	public void addstudent(StudentBean p) {
	

	}

	@Override
	public void updatePerson(StudentBean p) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<StudentBean> listPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentBean getPersonById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePerson(int id) {
		// TODO Auto-generated method stub

	}

}

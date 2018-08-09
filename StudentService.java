package com.wipro.service;

import java.util.List;

import com.wipro.bean.StudentBean;

public interface StudentService {

	void addstudent(StudentBean p);

	void updatePerson(StudentBean p);

	List<StudentBean> listPersons();

	StudentBean getPersonById(int id);

	void removePerson(int id);
}

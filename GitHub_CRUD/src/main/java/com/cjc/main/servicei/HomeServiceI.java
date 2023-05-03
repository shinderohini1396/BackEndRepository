package com.cjc.main.servicei;

import java.util.List;

import com.cjc.main.model.Student;

public interface HomeServiceI {

	void savedata(Student s);

	List<Student> displayAllData();

	void deleteData(int id);

}

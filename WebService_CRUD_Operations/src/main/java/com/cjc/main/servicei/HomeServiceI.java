package com.cjc.main.servicei;

import java.util.List;

import com.cjc.main.model.Student;

public interface HomeServiceI {

	void saveData(Student s);

	Student logincheck(String un, String ps);

	Iterable displayAllData();

	void deleteData(Student s);


}

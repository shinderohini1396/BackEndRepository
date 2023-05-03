package com.cjc.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.servicei.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI{

	@Autowired
	HomeRepository hr;
	
	@Override
	public void saveData(Student s) {
	hr.save(s);
		
	}

	@Override
	public Student logincheck(String un, String ps) 
	{
		Student s=hr.findAllByUsernameAndPassword(un, ps);
		return s;
		
	}

	@Override
	public Iterable displayAllData()
	{
		return hr.findAll();
	}

	@Override
	public void deleteData(Student s) {
		hr.delete(s);
		
	}

}

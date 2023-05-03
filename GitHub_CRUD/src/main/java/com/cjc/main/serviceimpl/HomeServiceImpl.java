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
	public void savedata(Student s) {
		hr.save(s);
		
	}

	@Override
	public List<Student> displayAllData() {
		List<Student> list=(List<Student>) hr.findAll();
		return list;
	}

	@Override
	public void deleteData(int id) {
	hr.deleteById(id);
		
	}

}

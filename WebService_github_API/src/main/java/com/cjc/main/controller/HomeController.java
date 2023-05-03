package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.servicei.HomeServiceI;

@RestController
public class HomeController {

	@Autowired 
	HomeServiceI hsi;

	@PostMapping(value = "/insertdata")
	public ResponseEntity<Student> saveData(@RequestBody Student s)
	{
		hsi.savedata(s);
		return new ResponseEntity<Student>(s,HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/getAlldata")
	public ResponseEntity<List<Student>> getAllData()
	{
		List<Student> list=hsi.displayAllData();
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
	
	@PutMapping(value = "/updatedata/{id}")
	public ResponseEntity<Student> update(@PathVariable int id,@RequestBody Student s)
	{
		hsi.savedata(s);
		return new ResponseEntity<Student>(s,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/deletedata/{id}")
	public ResponseEntity<Student> delete(@PathVariable int id)
	{
		hsi.deleteData(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}

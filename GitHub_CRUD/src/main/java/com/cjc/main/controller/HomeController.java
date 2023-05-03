package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public String saveData(@RequestBody Student s)
	{
		hsi.savedata(s);
		return "Save Data";
	}
	
	@GetMapping(value = "/getAlldata")
	public List<Student> getAllData()
	{
		List<Student> list=hsi.displayAllData();
		return list;
	}
	
	@PutMapping(value = "/updatedata")
	public String update(@PathVariable int id,@RequestBody Student s)
	{
		hsi.savedata(s);
		return "Update Data";
	}
	
	@DeleteMapping(value = "/deletedata")
	public String delete(@PathVariable int id)
	{
		hsi.deleteData(id);
		return "Delete Data";
	}
}

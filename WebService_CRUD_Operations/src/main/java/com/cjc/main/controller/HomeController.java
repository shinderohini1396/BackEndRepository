package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.servicei.HomeServiceI;

@RestController
public class HomeController {

	@Autowired
	HomeServiceI hsi;
	
	//post
	@RequestMapping(value="/insertData",method = RequestMethod.POST)
	public String savedata(@RequestBody Student s)
	{
		hsi.saveData(s);
		return "success";
	}
	
	//get
	@RequestMapping(value="/getAllData",method = RequestMethod.GET)
	public Iterable getListData()
	{
		Iterable list =hsi.displayAllData();
		return list;
	}
	
	//get
		@RequestMapping(value="/getSingleData/{un}/{ps}")
		public Student getSingleData(@PathVariable("un") String username,@PathVariable("ps") String password)
		{
			Student stu=hsi.logincheck(username,password);
			return stu;
		}
	
	//put
		@PutMapping(value="/updateput/{sid}")
		public String updateData(@PathVariable("sid") int sid,@RequestBody Student s)
		{
			hsi.saveData(s);
			return "update";
		}
	
		//patch
		@PatchMapping(value="/updatepatch/{sid}")
		public String updatePatchData(@PathVariable("sid") int sid,@RequestBody Student s)
		{
				hsi.saveData(s);
				return "update";
		}
		
		//delete
		@DeleteMapping(value="/deleteData/{sid}")
		public String deleteData(@PathVariable("sid") int sid,@ModelAttribute Student s)
		{
			hsi.deleteData(s);
			return "delete";
			
		}
		
	
} 

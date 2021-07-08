package com.myshop.demo.controller;

import java.util.HashMap;

import java.util.Optional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myshop.demo.entity.Appointments;
import com.myshop.demo.service.AppointmentService;

@RestController
@RequestMapping(value = "/appointmentsController")
public class AppointmentsController {
	
	@Autowired
	AppointmentService apSer;
	
	//this APi is to save / create new appointment
	
	@PostMapping(value = "/saveAppointment")
	public HashMap<String, Object> saveAppointment(@RequestBody Appointments a) {
		 Appointments data =apSer.saveAppointment(a);
		 HashMap<String, Object> map = new HashMap<>();
			if (data!=null) {
				map.put("code", "200");
				map.put("content", data);
			} else {
				map.put("code", "201");
				map.put("content", "no data");
				
			}
			return map;
		
	}
	@GetMapping(value = "/getAppointById")
	public HashMap<String, Object> getAppointById( Long id) {
		Optional<Appointments> getdata = apSer.findAppointmentById(id);
		HashMap<String, Object> map = new HashMap<>();
		if (getdata!=null) {
			map.put("code", "200");
			map.put("content", getdata);
		} else {
			map.put("code", "201");
			map.put("content", "no data");
			
		}
		return map;
		
	}
	
  @GetMapping(value = "/getAllAppointment")
  public  HashMap<String, Object> getAllAppointment(){
	  List<Appointments>appointmentdata=apSer.findAll();
	HashMap<String,Object> map= new HashMap<>();
	if (appointmentdata!=null) {
		map.put("code", "200");
		map.put("content", appointmentdata);
	} else {
		map.put("code", "201");
		map.put("content", "no data");
		
	}
	return map;
  }
       @PutMapping(value = "/updateAppointment")
       public HashMap<String, Object> updateAppointment(@RequestBody Appointments a) {
	   Appointments updatedata =apSer.saveAppointment(a);
	   HashMap<String, Object> map = new HashMap<>();
		if (updatedata!=null) {
			map.put("code", "200");
			map.put("content", updatedata);
		} else {
			map.put("code", "201");
			map.put("content", "no data");
			
		}
		return map;
	
	
       }

}

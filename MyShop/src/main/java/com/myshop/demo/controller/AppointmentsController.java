package com.myshop.demo.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping(value = "/saveAppointment")
	public HashMap<String, Object> saveAppointment(@RequestBody Appointments a) {
		 Appointments data =apSer.saveAppointment(a);
		 HashMap<String, Object> map = new HashMap<>();
			if (data!=null) {
				map.put("code", "200");
				map.put("content", data);
			} else {
				map.put("code", "201");
				map.put("content", "201");
				
			}
			return map;
		
	}
	
  @GetMapping(value = "/getAllAppointment")
  public  List<Appointments>getAllAppointment(){
	  List<Appointments>appointmentdata=apSer.findAll();
	  if(appointmentdata!= null && appointmentdata.isEmpty());
	  return appointmentdata;
  }

}

package com.myshop.demo.service;

import java.util.List;

import com.myshop.demo.entity.Appointments;

public interface AppointmentService {

	Appointments saveAppointment(Appointments a);

	List<Appointments> findAll();

}

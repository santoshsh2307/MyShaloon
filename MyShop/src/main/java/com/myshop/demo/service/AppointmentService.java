package com.myshop.demo.service;

import java.util.Optional;
import java.util.List;
import com.myshop.demo.entity.Appointments;

public interface AppointmentService {

	Appointments saveAppointment(Appointments a);

	Optional<Appointments> findAppointmentById(Long id);
	List<Appointments> findAll();

}

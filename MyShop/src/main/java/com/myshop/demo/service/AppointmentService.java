package com.myshop.demo.service;

import java.util.Optional;

import com.myshop.demo.entity.Appointments;

public interface AppointmentService {

	Appointments saveAppointment(Appointments a);

	Optional<Appointments> findAppointmentById(Long id);

}

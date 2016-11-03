package com.userfront.service;

import com.userfront.domain.Appointment;

import java.util.List;

/**
 * Created by z00382545 on 10/23/16.
 */
public interface AppointmentService {
    Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}

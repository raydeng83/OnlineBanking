package com.userfront.service.impl;

import com.userfront.dao.AppointmentDao;
import com.userfront.domain.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by z00382545 on 10/23/16.
 */

@Service
public class AppointmentService implements com.userfront.service.AppointmentService{

    @Autowired
    private AppointmentDao appointmentDao;

    public Appointment createAppointment(Appointment appointment) {
       return appointmentDao.save(appointment);
    }
}

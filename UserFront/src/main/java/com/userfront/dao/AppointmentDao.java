package com.userfront.dao;

import com.userfront.domain.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by z00382545 on 10/23/16.
 */
public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}

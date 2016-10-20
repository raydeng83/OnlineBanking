package com.userfront.dao;

import com.userfront.domain.Password;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by z00382545 on 10/20/16.
 */
public interface PasswordDao extends CrudRepository<Password, Long> {
}

package com.task.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.registration.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}

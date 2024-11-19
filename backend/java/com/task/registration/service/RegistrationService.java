package com.task.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.registration.model.Registration;
import com.task.registration.repository.RegistrationRepository;

@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepository registrationRepository;

    public List<Registration> getAllRegistrations() {
        return registrationRepository.findAll();
    }

    public Registration getRegistrationById(Long id) {
        return registrationRepository.findById(id).orElseThrow(() -> new RuntimeException("Registration not found"));
    }

    public void createRegistration(Registration registration) {
        registrationRepository.save(registration);
    }

    public void updateRegistration(Long id, Registration registrationDetails) {
        Registration existingRegistration = getRegistrationById(id);
        existingRegistration.setName(registrationDetails.getName());
        existingRegistration.setEmail(registrationDetails.getEmail());
        existingRegistration.setDateOfBirth(registrationDetails.getDateOfBirth());
        registrationRepository.save(existingRegistration); // Save the updated registration
    }

    public void deleteRegistration(Long id) {
        registrationRepository.deleteById(id);
    }
}

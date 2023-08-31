package com.pluralsight.springbootfundamentals.service;

import com.pluralsight.springbootfundamentals.entity.Application;
import com.pluralsight.springbootfundamentals.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;
    @Override
    public Iterable<Application> getAllApplications() {
        return applicationRepository.findAll();
    }
}

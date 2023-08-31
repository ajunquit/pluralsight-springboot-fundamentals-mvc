package com.pluralsight.springbootfundamentals.service;

import com.pluralsight.springbootfundamentals.entity.Application;

public interface ApplicationService {
    Iterable<Application> getAllApplications();
}

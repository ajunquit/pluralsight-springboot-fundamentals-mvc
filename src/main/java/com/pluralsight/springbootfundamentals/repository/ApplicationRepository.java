package com.pluralsight.springbootfundamentals.repository;

import com.pluralsight.springbootfundamentals.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}

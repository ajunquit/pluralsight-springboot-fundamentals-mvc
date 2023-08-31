package com.pluralsight.springbootfundamentals.repository;

import com.pluralsight.springbootfundamentals.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}

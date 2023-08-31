package com.pluralsight.springbootfundamentals.service;

import com.pluralsight.springbootfundamentals.entity.Application;
import com.pluralsight.springbootfundamentals.entity.Release;
import com.pluralsight.springbootfundamentals.repository.ApplicationRepository;
import com.pluralsight.springbootfundamentals.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReleaseServiceImpl implements ReleaseService {
    @Autowired
    private ReleaseRepository releaseRepository;

    @Override
    public Iterable<Release> getAllReleases() {
        return releaseRepository.findAll();
    }
}

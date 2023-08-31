package com.pluralsight.springbootfundamentals.service;

import com.pluralsight.springbootfundamentals.entity.Release;

public interface ReleaseService {
    Iterable<Release> getAllReleases();
}

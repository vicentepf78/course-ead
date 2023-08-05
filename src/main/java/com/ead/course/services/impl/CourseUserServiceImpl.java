package com.ead.course.services.impl;

import com.ead.course.repositories.CourseUserRepository;
import com.ead.course.services.CourseUserService;

public class CourseUserServiceImpl implements CourseUserService {

    private final CourseUserRepository courseUserRepository;

    public CourseUserServiceImpl(final CourseUserRepository courseUserRepository) {
        this.courseUserRepository = courseUserRepository;
    }
}

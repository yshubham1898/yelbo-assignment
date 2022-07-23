package com.project.yelboAssignment.service.implementation;

import com.project.yelboAssignment.entity.Category;
import com.project.yelboAssignment.repo.ValueRepository;
import com.project.yelboAssignment.service.interfaces.ValueService;
import com.project.yelboAssignment.util.ValueUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ValueImpl implements ValueService {

    @Autowired
    ValueRepository valueRepository;

    @Override
    public long updateValue(long value) throws InterruptedException {
        Optional<Category> value = valueRepository.findById(categoryCode);
        long nextVal = ValueUtil.getValue(value);
        Thread.sleep(5000);
        return nextVal;
    }
}

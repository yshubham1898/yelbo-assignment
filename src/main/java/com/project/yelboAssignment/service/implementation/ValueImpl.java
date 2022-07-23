package com.project.yelboAssignment.service.implementation;

import com.project.yelboAssignment.entity.Category;
import com.project.yelboAssignment.repo.ValueRepository;
import com.project.yelboAssignment.service.interfaces.ValueService;
import com.project.yelboAssignment.util.ValueUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ValueImpl implements ValueService {

    @Autowired
    ValueRepository valueRepo;


    @Transactional
    @Override
    public long[] updateValue(long categoryCode) {
        Category category = null;
        long[] resultArr = new long[2];
        try {
            Thread.sleep(5000);
            Category categoryFromDB = valueRepo.findById(categoryCode).orElse(null);

            category = categoryFromDB != null ? categoryFromDB : new Category();
            category.setCategoryCode(categoryCode);
            resultArr[0] = category.getValue();
            category.setValue(ValueUtil.getValue(category.getValue()));
            resultArr[1] = category.getValue();
            valueRepo.save(category);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return resultArr;
    }






}

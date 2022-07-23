package com.project.yelboAssignment.controller;


import com.project.yelboAssignment.service.interfaces.ValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/valueApi")
public class ValueController {
    @Autowired
    ValueService valueService;

    @PostMapping(value = "/getValue")
    public ResponseEntity getValue(@RequestBody Map<String, Long> request) throws InterruptedException {
        ResponseEntity responseEntity = new ResponseEntity();
        long categoryCode = request.get("categoryCode");
        long resultArr[] = valueService.updateValue(categoryCode);
        responseEntity.setPrevValue(resultArr[0]);
        responseEntity.setNewValue(resultArr[1]);
        return responseEntity;
    }

}

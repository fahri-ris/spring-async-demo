package com.demo.async.controllers;

import com.demo.async.dtos.MessageResponseDto;
import com.demo.async.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    TestService testService;

    @Autowired
    public TestController(TestService testService){
        this.testService = testService;
    }

    @PostMapping("/email")
    public ResponseEntity<MessageResponseDto> sendEmail(){
        return ResponseEntity.ok(testService.sendEmail());
    }
}

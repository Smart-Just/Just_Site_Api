package com.example.just_site_api.application.member.v1.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/member")
public class MemberController {

    @GetMapping("/")
    public ResponseEntity getUser(){
        return new ResponseEntity();
    }
}

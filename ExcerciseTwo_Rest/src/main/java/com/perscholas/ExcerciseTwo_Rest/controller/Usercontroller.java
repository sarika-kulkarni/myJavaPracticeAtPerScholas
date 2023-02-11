package com.perscholas.ExcerciseTwo_Rest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.perscholas.ExcerciseTwo_Rest.model.User;

@RestController
public class Usercontroller {
   @PostMapping("/users")
   public void printData(@RequestBody User user) {
       System.out.println("Printing the user data:"+user);
   }}
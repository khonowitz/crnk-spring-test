package com.kristin.crnk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kristin.crnk.domain.model.StaffUser;
import com.kristin.crnk.domain.repository.StaffUserRepositoryImpl;

import io.crnk.spring.boot.v3.CrnkConfigV3;

@RestController
@Import({CrnkConfigV3.class})
public class CrnkController {
  
  @Autowired
  private StaffUserRepositoryImpl staffUserRepository;

  @GetMapping("/staff_user/{staff_user_id}")
  public ResponseEntity<StaffUser> getUser(@PathVariable("staff_user_id") String staffUserId) {
      return new ResponseEntity<>(staffUserRepository.findById(staffUserId), HttpStatus.OK);
  }
}
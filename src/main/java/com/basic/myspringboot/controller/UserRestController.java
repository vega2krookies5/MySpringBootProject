package com.basic.myspringboot.controller;

import com.basic.myspringboot.repository.CustomerRepository;
import com.basic.myspringboot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserRestController {
    private final UserRepository userRepository;

    //Constructor Injection
//    public UserRestController(UserRepository userRepository) {
//        log.info("UserRepository 구현클래스명 = {}",userRepository.getClass().getName());
//        this.userRepository = userRepository;
//    }


}

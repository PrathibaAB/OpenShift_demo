package com.sample.restapi.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userAPI")
public class SampleController {

	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
    public String home(){
        return "Hello World!";
    }
}

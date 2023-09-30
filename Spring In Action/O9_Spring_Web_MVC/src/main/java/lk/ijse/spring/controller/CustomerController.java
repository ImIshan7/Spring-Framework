package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer") //Handle Mapping
public class CustomerController {


    //Handle Method
    @GetMapping
    public String helloSpring(){

        return "Hello Spring : Your Request To Received";
    }
}

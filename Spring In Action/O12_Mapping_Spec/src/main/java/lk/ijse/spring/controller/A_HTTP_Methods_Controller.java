package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/http")

public class A_HTTP_Methods_Controller {

    //How to handle http request with Spring
    //For different HTTP methods

    @GetMapping
    public String getMapping1(){
        return "Get Mapping Invoked 1";
    }

    /*@GetMapping
    public void test2(){
        System.out.println("Test 2");
    }*/


    @PostMapping
    public String postmanTest(){
        return "Postman Test";
    }

    @PutMapping
    public  String putTest(){
        return "Put Test";
    }

    @DeleteMapping
    public String deleteTest(){
        return "Delete Test";
    }



}

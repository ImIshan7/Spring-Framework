package lk.ijse.spring.controller;


import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/rest")
public class RestArchController {

   /* @GetMapping
    public void test(){
        System.out.println("Test");
    }*/

    @GetMapping
    public String getMapping1(HttpServletRequest req, HttpServletResponse res){
        String id = req.getParameter("id");
        System.out.println(id);
        return "Get Mapping Invoked 1";
    }

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

   /* @GetMapping
    public void test1(){
        System.out.println("Test");
    }
*/

}

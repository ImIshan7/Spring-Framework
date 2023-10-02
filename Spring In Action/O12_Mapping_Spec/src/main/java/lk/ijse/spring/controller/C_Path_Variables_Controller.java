package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pathVariable")
public class C_Path_Variables_Controller {
//With the previous path segments we can pass simple data
//path="/customer/{ID}" @PathVariable("ID")
//localhost:8080/mapping/customer/C001
//localhost:8080/mapping/customer/delete/C001


    @GetMapping(path = "/{id}")
    public String getMapping2(@PathVariable String id){
        System.out.println(id);
        return "Get Mapping Invoked 1 "+id;
    }

    //request narrow downing using path segments
    @GetMapping(path = "/{id}/{name}")
    public String getMapping1(@PathVariable String id,@PathVariable String name){
        System.out.println(id+" "+name);
        return "Get Mapping Invoked 2 "+id+" "+name;
    }

}

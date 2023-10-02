package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/headers")
public class F_Request_Headers_Controller {
    //Also we can narrow down a request using request headers also
    //Every Request Consists with two parts
    //Header (Meta-data)
    //Body

    //So using these meta-data we can narrow down requests in spring
    //consumes = {MediaType}, this will require content-type header from front end
    //produce = Accept
    //headers = {"Content-Type=application/json","Accept=text/html"}

    @GetMapping(consumes = "application/json")
    public String getMapping1() {
        return "Get Mapping Invoked 1";
    }

    //to invoke this you have to send content-type=text/html from the fornt
    //end
    @GetMapping(consumes = "text/html")
    public String getMapping2() {
        return "Get Mapping Invoked 2";
    }

    @GetMapping(produces = "text/html")
    public String getMapping3() {
        return "Get Mapping Invoked 2";
    }


}

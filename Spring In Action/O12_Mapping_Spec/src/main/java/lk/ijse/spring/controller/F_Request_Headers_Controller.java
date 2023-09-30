package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class F_Request_Headers_Controller {
    //Also we can narrow down a request using request headers also
    //Every Request Consists with two parts
    //Header (Meta-data)
    //Body

    //So using these meta-data we can narrow down requests in spring
    //consumes = {MediaType}, this will require content-type header from front end
    //produce = Accept
    //headers = {"Content-Type=application/json","Accept=text/html"}
}

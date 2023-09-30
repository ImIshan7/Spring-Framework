package lk.ijse.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/item")
public class B_Controller {

    @GetMapping
    public ModelAndView test(){
        ModelAndView m= new ModelAndView("/item");
        m.addObject("ItemName","Monitor");
        return m;
    }
}

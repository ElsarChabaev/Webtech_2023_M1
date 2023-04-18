package Webtech2023.icomify.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/")
    public List<String> showHelloWorldPage(){

        return List.of("Hello World");
    }

}

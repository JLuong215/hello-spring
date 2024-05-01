package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    //Handle request at /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }



        //Handles request of the form /hello?name=LaunchCode

//        @GetMapping("hello")
//        @ResponseBody
//        public String helloWithQueryParam(@RequestParam String name){
//            return "Hello, " + name + "!";
//        }


    //Handles requests of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
    public String helloWithPathParam(@PathVariable String name){
            return "Hello, " + name + "!";
    }
    //lives at hello/goodbye
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }


    @GetMapping("form")
    public String helloForm(){
            return "<html>" +
                        "<body>" +
                            "<form action= 'hello' method-'post'>" + //submit a request to /hello
                                "<input type= 'text' name= 'name'>" +
                                "<input type= 'submit' value='Greet me!'>" +
                             "</form>" +
                        "</body>" +
                    "</html>";
    }


        @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
        public String helloWithQueryParam(@RequestParam String name){
            return "Hello, " + name + "!";
        }

}

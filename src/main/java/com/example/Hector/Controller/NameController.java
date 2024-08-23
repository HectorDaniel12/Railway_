package com.example.Hector.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @GetMapping("/nombre")
    public String nombre(){
        return  "hector ramirez";
    }
}

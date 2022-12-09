package sn.groupeisi.parcinfo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@SpringBootApplication
@Controller
public class AppUserController {
    @GetMapping("/")
    public String home(){
        return "Travail DevOps a trois";
    }

    public static void main(String[] args) {
        SpringApplication.run(AppUserController.class, args);
    }

}

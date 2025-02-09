package com.example.demo;  

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  

@SpringBootApplication  
@RestController  
public class DemoApplication {  

    public static void main(String[] args) {  
        SpringApplication.run(DemoApplication.class, args);  
    }  

    @GetMapping("/")  
    public String welcome() {  
        return "<html>" +  
                "<head>" +  
                "<title>Bienvenue</title>" +  
                "<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css'>" +  
                "<style>" +  
                "body { " +  
                "    display: flex; " +  
                "    flex-direction: column; " +  
                "    align-items: center; " +  
                "    justify-content: center; " +  
                "    height: 100vh; " +  
                "    background-color: #f0f8ff; " +  
                "    font-family: Arial, sans-serif; " +  
                "    text-align: center; " +  
                "} " +  
                "h1 { " +  
                "    color: #2c3e50; " +  
                "} " +  
                "i { " +  
                "    font-size: 50px; " +  
                "    margin: 10px; " +  
                "    color: #2c3e50;" +  
                "}" +  
                "</style>" +  
                "</head>" +  
                "<body>" +  
                "<h1>Bienvenue dans le site de Sabrina !</h1>" +  
                "<div>" +  
                "    <i class='fas fa-sun'></i>" +  // Icône de soleil  
                "    <i class='fas fa-smile'></i>" + // Icône de visage souriant  
                "    <i class='fas fa-heart'></i>" + // Icône de cœur  
                "</div>" +  
                "<p>Enjoy !</p>" +  
                "</body>" +  
                "</html>";  
    }  
}

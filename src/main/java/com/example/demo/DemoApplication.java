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
                "img { " +  
                "    width: 50px; " +  
                "    height: 50px; " +  
                "    margin: 10px; " +  
                "}" +  
                "</style>" +  
                "</head>" +  
                "<body>" +  
                "<h1>Bienvenue dans le site de Sabrina !</h1>" +  
                "<div>" +  
                "    <img src='https://img.icons8.com/color/48/000000/sunrise.png' alt='Icône de lever de soleil'/>" +  
                "    <img src='https://img.icons8.com/color/48/000000/smiling-face.png' alt='Icône de visage souriant'/>" +  
                "    <img src='https://img.icons8.com/color/48/000000/heart.png' alt='Icône de cœur'/>" +  
                "</div>" +  
                "<p>Nous espérons que vous passerez un bon moment ici.</p>" +  
                "</body>" +  
                "</html>";  
    }  
}

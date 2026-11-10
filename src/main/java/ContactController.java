package com.example.contactform;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @PostMapping(value = "/contact", produces = "text/html")
    public String handleContact(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message) {

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Message: " + message);

     return "<!DOCTYPE html>" +
       "<html>" +
       "<head>" +
       "<meta charset='UTF-8'>" +
       "<title>Thank You</title>" +
       "<style>" +
       "body { margin:0; min-height:100vh; display:flex; justify-content:center; align-items:center; font-family:Arial,sans-serif; background:linear-gradient(135deg,#667eea,#764ba2); }" +
       ".success-box { background:white; width:400px; max-width:80%; padding:35px; text-align:center; border-radius:20px; box-shadow:0 8px 25px rgba(0,0,0,0.2); }" +
       ".success-box h2 { color:#16a085; font-size:26px; }" +
       ".success-box p { color:#444; font-size:16px; line-height:1.5; }" +
       ".success-box a { display:inline-block; background:#6549c9; color:white; padding:12px 25px; text-decoration:none; border-radius:8px; margin-top:15px; }" +
       ".success-box a:hover { background:#4834a0; }" +
       "</style>" +
       "</head>" +
       "<body>" +
       "<div class='success-box'>" +
       "<h2>🎉 Thank You for Submitting!</h2>" +
       "<p>Your message has been received successfully.</p>" +
       "<p>We appreciate you contacting us!</p>" +
       "<a href='/index.html'>Go Back</a>" +
       "</div>" +
       "</body>" +
       "</html>";
    }
}

@RestController
public class ContactController {
    @PostMapping("/contact")
    public String handleContact(@RequestParam String name,
                                @RequestParam String email,
                                @RequestParam String message){
        System.out.println("Name: " + name + ", Email: " + email + ", Message: " + message);
        return "Form submitted successfully!";
    }
}

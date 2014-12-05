package webapp;

import org.springframework.ui.Model;


public class Greetings {

    public static void addGreeting(Model model) {

        model.addAttribute("greeting", "Hello from Mustache!");
    }
}

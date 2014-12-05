package webapp;

import org.springframework.ui.Model;

import java.util.Arrays;


public class People {

    public static void addPeople(Model model) {

        Person ruby = new Person("Ruby Heckler", 32);
        Person bernhard = new Person("Bernhard Klein", 55);
        Person trogdor = new Person("Trogdor", 3221);

        model.addAttribute("people", Arrays.asList(ruby, bernhard, trogdor));
    }
}

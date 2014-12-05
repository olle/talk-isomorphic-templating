package webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Index {

    @RequestMapping(value = "/")
    public ModelAndView displayIndexPage(Model model) {

        Greetings.addGreeting(model);
        People.addPeople(model);

        return new ModelAndView("index", model.asMap());
    }
}

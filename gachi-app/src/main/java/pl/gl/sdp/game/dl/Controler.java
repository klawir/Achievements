package pl.gl.sdp.game.dl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;

import javax.servlet.http.HttpSession;
import javax.xml.ws.RequestWrapper;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class Controler {

    @Autowired
    private Manager manager;

    @GetMapping("/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model)
    {
        model.addAttribute("name", name);
        return "main";
    }

    @RequestMapping(value="/", method = RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Achievement achievement, HttpSession session) {
        String names = (String) session.getAttribute("names");
        if (names == null) {
            session.setAttribute("names", names);
        }
        System.out.println(names);
        manager.getAchievementList().add(new Achievement(names));
        return "main";
    }
}
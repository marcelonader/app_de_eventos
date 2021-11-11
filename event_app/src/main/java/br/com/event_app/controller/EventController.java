package br.com.event_app.controller;

import br.com.event_app.model.Event;
import br.com.event_app.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Controller
public class EventController {

    @Autowired
    private EventRepository er;

//    @GetMapping("registerEvent")
    @RequestMapping(value = "registerEvent", method = RequestMethod.GET)
    public String form(){
        return "event/formEvent";
    }

//    @PostMapping("registerEvent")
    @RequestMapping(value = "registerEvent", method = RequestMethod.POST)
    public String form(Event event){
        er.save(event);
        System.out.println(event);
        return "redirect:/registerEvent";
    }


//    @GetMapping("hello/{name}")
//    public String sayHello(Model model, @PathVariable String name){
//        model.addAttribute("name", String.valueOf(name.charAt(0)).toUpperCase() + name.substring(1));
//        return "event";
//    }
}

package me.hangyeol.springbookservice.databinding;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

//    @InitBinder
//    public void init(WebDataBinder webDataBinder) {
//        webDataBinder.registerCustomEditor(Event2.class, new EventEditor());
//    }



    @GetMapping("/event/{event2}")
    public String getEvent(@PathVariable Event2 event2) {
        System.out.println(event2);
        return event2.getId().toString();
    }


}

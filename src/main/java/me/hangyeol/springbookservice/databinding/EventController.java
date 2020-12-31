package me.hangyeol.springbookservice.databinding;

import me.hangyeol.springbookservice.resourceabstraction.Event;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class EventController {

//    @InitBinder
//    public void init(WebDataBinder webDataBinder) {
//        webDataBinder.registerCustomEditor(Event2.class, new EventEditor());
//    }

    @PostMapping("/event")
    public ResponseEntity<Event> create(@Valid @RequestBody Event event,
                                        Errors errors) {
        if (errors.hasErrors()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(event);
    }

    @GetMapping("/event/{event2}")
    public String getEvent(@PathVariable Event2 event2) {
        System.out.println(event2);
        return event2.getId().toString();
    }


}

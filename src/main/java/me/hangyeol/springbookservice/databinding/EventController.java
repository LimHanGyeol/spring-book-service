package me.hangyeol.springbookservice.databinding;

import me.hangyeol.springbookservice.resourceabstraction.Event;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Section3. DataBinding
 * DataBinding 추상화. PropertyEditor
 */
@RestController
public class EventController {

    // InitBinder 로 컨트롤러에서 사용할 PropertyEditor 를 정의한다.
    @InitBinder
    public void init(WebDataBinder webDataBinder) {
        webDataBinder.registerCustomEditor(Event.class, new EventEditor());
    }

    @GetMapping("/event/{event}")
    public String getEvent(@PathVariable Event event) {
        System.out.println(event);
        return event.getId().toString();
    }

    /**
     * Validation 확인하는 컨트롤러
     */
    @PostMapping("/event")
    public ResponseEntity<Event> create(@Valid @RequestBody Event event,
                                        Errors errors) {
        if (errors.hasErrors()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().body(event);
    }


}

package me.hangyeol.springbookservice.databinding;

import me.hangyeol.springbookservice.resourceabstraction.Event;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

/**
 * Section3. DataBinding
 * DataBinding 추상화. Converter 와 Formatter
 * Formatter 도 Thread-safe 하여 Bean 으로 등록하여 사용할 수 있다.
 */
@Component
public class EventFormatter implements Formatter<Event> {

    //@Autowired
    //MessageSource messageSource;

    // 문자를 받아서 객체로 변환
    @Override
    public Event parse(String text, Locale locale) throws ParseException {
        return new Event(Integer.parseInt(text));
    }

    // 객체를 받아서 문자로 변환
    @Override
    public String print(Event object, Locale locale) {
        // message 코드를 받아와서 해당하는 locale 에 맞는 메세지를 내보낼 수 있다.
        //messageSource.getMessage("title", locale);
        return object.getId().toString();
    }

}

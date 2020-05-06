package me.hangyeol.springbookservice.databinding;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

public class EventConverter {

    @Component
    public static class stringToEventConverter implements Converter<String, Event2> {

        @Override
        public Event2 convert(String source) {
            return new Event2(Integer.parseInt(source));
        }
    }

//    @Component
    public static class eventToStringConverter implements Converter<Event2, String> {

        @Override
        public String convert(Event2 source) {
            return source.getId().toString();
        }
    }

}

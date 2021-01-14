package me.hangyeol.springbookservice.databinding;

import me.hangyeol.springbookservice.resourceabstraction.Event;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Section3. DataBinding
 * DataBinding 추상화. Converter 와 Formatter
 * 아래 두개의 Converter 가 아까의 PropertyEditor 와 같은 역할을 하는 것이다.
 * Converter 는 상태 정보가 없기 때문에 Bean 으로 등록할 수 있다.
 * 기본적으로 int 값 등은 Converter 나 Formatter 가 자동으로 값을 등록 해준다.
 * 모든걸 구현할 필요는 없다.
 */
public class EventConverter {

    @Component
    public static class StringToEventConverter implements Converter<String, Event> {

        @Override
        public Event convert(String source) {
            int eventId = Integer.parseInt(source);
            return new Event(eventId);
        }
    }

    @Component
    public static class EventToStringConverter implements Converter<Event, String> {

        @Override
        public String convert(Event source) {
            return source.getId().toString();
        }
    }

}

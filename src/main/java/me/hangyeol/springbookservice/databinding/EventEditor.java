package me.hangyeol.springbookservice.databinding;

import me.hangyeol.springbookservice.resourceabstraction.Event;

import java.beans.PropertyEditorSupport;

/**
 * Section3. DataBinding
 * DataBinding 추상화. PropertyEditor
 * getValue, setValue 는 PropertyEditor 가 가지고 있는 값이다.
 * 값이 서로 다른 스레드에게 공유가 되기 때문에 state-full 하여 상태정보를 저장하고 있다.
 * 그래서 PropertyEditor 는 Thread-safe 하지 않는다.
 * PropertyEditor 의 구현체들은 여러 스레드에 공유해서 사용하면 안된다.
 * Bean 으로 등록하면 안된다. 각각 다른 데이터에 접근이 될 문제가 있다.
 *
 * PropertyEditor 를 이용하는 방법은 편리하지 않다. 게다가 Thread-safe 하지도 않다.
 */
public class EventEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        Event event = (Event) getValue();
        return event.getId().toString();
    }

    // text 를 event 로 변환
    // propertyEditor 는 thread-safe 하지 않다. 여러 스레드끼리 공유해서 쓰면 안된다.
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        int eventId = Integer.parseInt(text);
        setValue(new Event(eventId));
    }

}

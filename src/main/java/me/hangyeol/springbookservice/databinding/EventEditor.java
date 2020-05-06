package me.hangyeol.springbookservice.databinding;

import java.beans.PropertyEditorSupport;

public class EventEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        Event2 event2 = (Event2)getValue();
        return event2.getId().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new Event2(Integer.parseInt(text)));
    }
}

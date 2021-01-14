package me.hangyeol.springbookservice.expressionlanguage;

import org.springframework.stereotype.Component;

/**
 * Section4. Spring Expression Language
 * SpEL
 */
@Component
public class Sample {

    private int data = 200;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

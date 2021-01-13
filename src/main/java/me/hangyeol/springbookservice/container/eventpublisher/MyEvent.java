package me.hangyeol.springbookservice.container.eventpublisher;

/**
 * Section1. IoC 컨테이너와 빈
 * 8부 : Application Event Publisher
 * EventListener 를 구현해야 하는 내용이 사라졌다. 해당 항목에서 스프링의 비침투성 철학을 알 수 있다.
 */
public class MyEvent {

    private final int data;
    private final Object source;

    public MyEvent(Object source, int data) {
        this.source = source;
        this.data = data;
    }

    public int getData() {
        return data;
    }

}

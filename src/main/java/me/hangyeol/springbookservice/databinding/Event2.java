package me.hangyeol.springbookservice.databinding;

public class Event2 {

    private Integer id;
    private String title;

    public Event2(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Event2{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}

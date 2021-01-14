package me.hangyeol.springbookservice.resourceabstraction;


import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Section2. Resource / Validation, Section3. DataBinding
 * Validation 추상화, DataBinding 추상화. PropertyEditor
 */
public class Event {

    Integer id;

    @NotEmpty
    String title;

    @NotNull
    @Min(0)
    Integer limit;

    @Email
    String email;

    public Event(Integer id) {
        this.id = id;
    }

    public Event(Integer id, String title, Integer limit, String email) {
        this.id = id;
        this.title = title;
        this.limit = limit;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", limit=" + limit +
                ", email='" + email + '\'' +
                '}';
    }
}

package me.hangyeol.springbookservice.resourceabstraction;


import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Section2. Resource / Validation
 * Validation 추상화
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

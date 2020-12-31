package me.hangyeol.springbookservice.databinding;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.hangyeol.springbookservice.resourceabstraction.Event;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest({EventConverter.stringToEventConverter.class, EventController.class})
public class EventControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void getTest() throws Exception {
        mockMvc.perform(get("/event/1"))
                .andExpect(status().isOk())
                .andExpect(content().string("1"));
    }

    @Test
    @DisplayName("validation 테스트")
    void createEvent() throws Exception {
        Event event = new Event();
        event.setTitle("test title");
        event.setLimit(10);
        event.setEmail("dlagksruf19@naver.com");

        mockMvc.perform(post("/event")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(objectMapper.writeValueAsString(event)))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("invalidation 테스트")
    void invalidateCreateEvent() throws Exception {
        Event event = new Event();

        mockMvc.perform(post("/event")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(objectMapper.writeValueAsString(event)))
                .andExpect(status().isBadRequest());
    }

}

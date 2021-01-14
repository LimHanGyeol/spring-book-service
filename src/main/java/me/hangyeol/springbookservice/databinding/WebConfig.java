package me.hangyeol.springbookservice.databinding;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Section3. DataBinding
 * DataBinding 추상화. Converter 와 Formatter
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new EventConverter.StringToEventConverter());
        registry.addFormatter(new EventFormatter());
    }

}

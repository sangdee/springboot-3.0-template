package com.example.template.base.logger;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@Configuration
public class RequestLoggingFilter{

    @Bean
    public CommonsRequestLoggingFilter logFilter() {
        CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
        filter.setIncludeHeaders(true);
        filter.setIncludeQueryString(true);
        filter.setIncludePayload(true);
        filter.setMaxPayloadLength(10000);
        filter.setIncludeClientInfo(true);
        filter.setBeforeMessagePrefix("Request : ");
        filter.setBeforeMessageSuffix("");
        filter.setAfterMessagePrefix("EndOfRequest : ");
        filter.setAfterMessageSuffix("");
        return filter;
    }
}

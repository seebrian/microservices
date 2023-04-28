package com.microservices.notificationservice.event;

import lombok.*;
import org.springframework.context.ApplicationEvent;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPlacedEvent {
    private String orderNumber;
}



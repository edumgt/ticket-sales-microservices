package com.krimo.event.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.krimo.event.data.Section;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {

    @JsonProperty("event_code")
    private String eventCode;
    private Section section;
}

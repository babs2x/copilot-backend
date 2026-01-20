package com.example.CopilotBackend.DTO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.example.CopilotBackend.Entity.EventStatus;

public class EventRequestDTO {
   List<SpeakerDTO> speakers;
    List<UserRequestDTO> users;
    List<GuestUserDTO> guestUsers;
    private Long eventId;
    private String eventName;
    private String eventDescription;
    private EventStatus status;
    private LocalDate eventDate;
    private LocalTime eventTime;
    private String location;
    private String host;
    private String eventPic;
}

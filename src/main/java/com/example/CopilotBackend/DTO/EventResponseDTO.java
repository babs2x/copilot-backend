package com.example.CopilotBackend.DTO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.example.CopilotBackend.Entity.EventStatus;

public class EventResponseDTO {
   List<SpeakerDTO> speakers;
    List<UserResponseDTO> users;
    List<GuestUserDTO> guestUsers;
    private Long eventId;
    private String eventName;
    private String eventDescription;
    private EventStatus status;
    private LocalDate eventDate;
    private LocalTime eventTime;
    private String eventPic;
    private String location;
    private String host;
}

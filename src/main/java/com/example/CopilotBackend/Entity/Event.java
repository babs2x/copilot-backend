package com.example.CopilotBackend.Entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "events")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "eventId")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;
    private String eventName;
    @Column(columnDefinition ="TEXT")
    private String eventDescription;
    @Column(columnDefinition ="TEXT")
    private String location;
    private String host;
    private String eventPic;
     @Enumerated(EnumType.STRING)
    private EventStatus status;
    @Column(name = "event_date")
    private LocalDate eventDate;
    @Column(name = "event_time")
    private LocalTime eventTime;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "event_speaker",
        joinColumns = @JoinColumn(name = "event_id"),
        inverseJoinColumns = @JoinColumn(name = "speaker_id")
    )

    private List<Speaker> speakers = new ArrayList<>();

      @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name="event_users",
        joinColumns = @JoinColumn(name="event_id"),
        inverseJoinColumns = @JoinColumn(name="user_id")
    )
    private List<User> users=new ArrayList<>();
}

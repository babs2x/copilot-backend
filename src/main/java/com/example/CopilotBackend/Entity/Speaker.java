package com.example.CopilotBackend.Entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
@Entity
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "speakerId")
public class Speaker {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long speakerId;
    private String speakerDescription;
    private String speakerName;
    private String speakerLink;
    private String speakerPic;
    @ManyToMany(mappedBy = "speakers")

    private final List<Event> events = new ArrayList<>();

}

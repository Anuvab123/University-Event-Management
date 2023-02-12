package com.example.UniversityEventManagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Event {
    private int eventId;
    private String eventName;
    private String location;
    private String startime;
    private String endTime;
    private String date;
}

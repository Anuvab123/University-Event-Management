package com.example.UniversityEventManagement.controller;

import com.example.UniversityEventManagement.model.Event;
import com.example.UniversityEventManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2/event")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping("add-event")
    public void addEvent(@RequestBody Event event){
        eventService.addEvent(event);
    }

    @GetMapping("getall-event")
    public List<Event> getEvent(){
        return eventService.getEvent();
    }

    @DeleteMapping("delete-event/date/{date}")
    public void delEvent(@PathVariable String date){
        eventService.delEvent(date);
    }

    @GetMapping("get-by-date/date/{date}")
    public Event getbydate(@PathVariable String date){
        return eventService.getbydate(date);
    }
}

package com.example.UniversityEventManagement.service;

import com.example.UniversityEventManagement.model.Event;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EventService {

    private static List<Event> events=new ArrayList<>();
    static int evcount=0;
    static{
        events.add(new Event(++evcount,"Liganza","Asansol","10 AM","2 PM","jan10"));
        events.add(new Event(++evcount,"Fesista","Kanyapur","9 AM","1PM","jan15"));
        events.add(new Event(++evcount,"Liganza","Chinakuri","11 AM","3 PM","jan20"));
    }

    public void addEvent(Event event){
        events.add(event);
    }

    public List<Event> getEvent(){
        return events;
    }

    public Event getbydate(String date){
        for(Event event:events){
            if(event.getDate().equals(date)){
                return event;
            }
        }
        return null;
    }

    public void delEvent(String date){
        Event ev=getbydate(date);
        events.remove(ev);
    }
}

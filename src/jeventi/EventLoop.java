/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jeventi;

import Common.EventQueue;
import java.util.LinkedList;

/**
 *
 * @author Administrator
 */
public class EventLoop {
    
    private LinkedList<EventQueue> eventQueue;

    /**
     * Before rising new event you must perform some actions before. You have to
     * register new event then register an object to that event. After these steps
     * you can rise an event.
     * @param EventType
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public void registerNewEvent(Class EventType) throws InstantiationException, IllegalAccessException{
        boolean isReplicated = false;
        for(EventQueue eq : this.eventQueue){
            if(eq.getEventType() == EventType){
                isReplicated = true;
            }            
        }
        if(!isReplicated){
            boolean add;
                    add = this.eventQueue.add(
                            (EventQueue) EventType.newInstance());
        }
    }
    
    
}

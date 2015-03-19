/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Common;

import java.util.LinkedList;

/**
 *
 * @author Administrator
 */
public class Event {
    private Object sender;
    private LinkedList<Object> args;
    /**
     * 
     * @return sender object, you can get the type of object by calling getClass() method;
     */
    public Object getSender()
    {
        return this.sender;
    }
    private void setSender(Object sender)
    {
        this.sender = sender;
    }

    /**
     *
     * You must set the sender of event.
     * @param sender
     */
    public Event(Object sender)
    {
        this.setSender(sender);
    }
    
}

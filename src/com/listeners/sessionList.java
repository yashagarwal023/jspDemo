package com.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class sessionList
 *
 */
@WebListener
public class sessionList implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public sessionList() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    int count=1;
    public void sessionCreated(HttpSessionEvent event)  { 
         // TODO Auto-generated method stub
    	event.getSession().getId();
    
    	System.out.println(count);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}

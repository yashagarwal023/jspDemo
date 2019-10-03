package com.listeners;

import java.sql.Connection;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.Controller.utilities.ConnectionManager;

/**
 * Application Lifecycle Listener implementation class ctxListener
 *
 */
@WebListener
public class ctxListener implements ServletContextListener {

private Connection connection;
    public ctxListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 

    System.out.println("JSP DEMO CONTEXT DESTROYED");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event)  { 
    	
    	connection=ConnectionManager.getConnection();
    	event.getServletContext().setAttribute("conn", connection);
    	
    	
    }
	
}

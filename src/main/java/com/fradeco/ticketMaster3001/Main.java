package com.fradeco.ticketMaster3001;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.fradeco.ticketMaster3001.model.Revision;
import com.fradeco.ticketMaster3001.model.Ticket;
import com.fradeco.ticketMaster3001.util.SessionFactoryManager;


public class Main 
{
    public static void main( String[] args ) {
    	SessionFactoryManager sfm = new SessionFactoryManager();
    	SessionFactory sf = sfm.initSessionFactory();
    	Session s = sf.openSession();
    	Revision rev1 = new Revision("12-11-2017", 1.0f,"drucker druckt nicht");
    	Revision rev2 = new Revision("13-11-2017", 1.0f,"drucker druckt nicht");
    	s.save(rev1);
    	s.save(rev2);
    	s.close();
        System.out.println( "Hello World!" );
        
        Ticket tick1 = new Ticket(4044567, "AP01", rev1);
        tick1.addRevision(rev2);
        System.out.println(tick1);
    }
}

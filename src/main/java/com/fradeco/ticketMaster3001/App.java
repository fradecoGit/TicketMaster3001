package com.fradeco.ticketMaster3001;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.fradeco.ticketMaster3001.model.Revision;
import com.fradeco.ticketMaster3001.util.SessionFactoryManager;

public class App 
{
    public static void main( String[] args ) {
    	SessionFactoryManager sfm = new SessionFactoryManager();
    	SessionFactory sf = sfm.initSessionFactory();
    	Session s = sf.openSession();
    	Revision rev = new Revision("12-11-2017", 1.0f,"drucker druckt nicht");
    	s.save(rev);
    	s.close();
        System.out.println( "Hello World!" );
    }
}

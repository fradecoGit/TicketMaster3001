package com.fradeco.ticketMaster3001.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryManager {
	private SessionFactory sessionFactory = null;
	
	public SessionFactory initSessionFactory() {
		final StandardServiceRegistry registry =
				new StandardServiceRegistryBuilder()
				.configure()
				.build();
		try {
			sessionFactory = new MetadataSources(registry)
					.buildMetadata()
					.buildSessionFactory();
			
		} catch (Exception e) {
			System.out.println("Exception building SessionFactory:");
			System.out.println(e.getMessage());
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("StandardServiceRegistry has been destroyed!");
		}
		
		return sessionFactory;
	
	}

}

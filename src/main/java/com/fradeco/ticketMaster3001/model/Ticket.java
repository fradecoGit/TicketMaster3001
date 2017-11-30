package com.fradeco.ticketMaster3001.model;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private long ticketID;
	private String instanz;
	private List<Revision> revisionList;
	
	public Ticket(long ticketID, String instanz, Revision revision) {
		this.ticketID = ticketID;
		this.instanz = instanz;
		this.revisionList = new ArrayList<Revision>();
		this.revisionList.add(revision);
	}
	
	public void addRevision(Revision revision) {
		this.revisionList.add(revision);
	}
	
	public boolean remRevison(Revision revision) {
		for (Revision listedRev : this.revisionList) {
			if (listedRev.getRevisionID() == revision.getRevisionID()) {
				return this.revisionList.remove(listedRev);
			}
		}
		return false;
	}
	
	public boolean remRevison(long revisionID) {
		for (Revision listedRev : this.revisionList) {
			if (listedRev.getRevisionID() == revisionID) {
				return this.revisionList.remove(listedRev);
			}
		}
		return false;
	}
	
	public String toString() {
		String revisionIDList = "";
		for (Revision revision: this.revisionList) {
			revisionIDList = revisionIDList + Long.toString(revision.getRevisionID()) + ", ";
		}
		revisionIDList = revisionIDList.substring(0, revisionIDList.length() - 2);
		return "Ticket " + Long.toString(this.ticketID) + 
				": [Instanz: " + instanz + "; Revision: [" + revisionIDList + "]]";
	}
	
	public Ticket() {}
	
	public long getTicketID() {return this.ticketID;}
	public void setTicketID(long ticketID) {this.ticketID = ticketID;}
	
	public String getInstanz() {return this.instanz;}
	public void setInstanz(String instanz) {this.instanz = instanz;}
	
	public List<Revision> getRevisionList() {return this.revisionList;}
	public void setRevisionList(List<Revision> revisionList) {this.revisionList = revisionList;}

}

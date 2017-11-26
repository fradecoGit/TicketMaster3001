package com.fradeco.ticketMaster3001.model;

public class Revision {
	private long revisionID = 0;
	private String date;
	private float duration;
	private String description;

	public Revision(String date, float duration, String description) {
		this.date = date;
		this.duration = duration;
		this.description = description;
	}
	
	public String toString() {
		return
		"Revision: [Date: " + date + 
		";Duration: " + Float.toString(duration) +
		";Description: " + description + "]";
	}
	
	public Revision() {}
	
	public long getRevisionID() {return this.revisionID;}
	public void setRevisionID(long revisionID) {this.revisionID = revisionID;}
	
	public String getDate() {return this.date;}
	public void setDate(String date) {this.date = date;}
	
	public float getDuration() {return this.duration;}
	public void setDuration(float duration) {this.duration = duration;}
	
	public String getDescription() {return this.description;}
	public void setDescription(String description) {this.description = description;}
	
}

package com.creditsuisse.entity;

public class Events {
	
	public String id;
	public String state;
	public long timestamp;
	public String type;
	public String host;
	
	@Override
	public String toString() {
		return "Events [id=" + id + ", state=" + state + ", timestamp=" + timestamp + ", type=" + type + ", host="
				+ host + "]";
	}
	
}

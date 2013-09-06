package com.tcs.effort.domain;

import org.springframework.stereotype.Service;

@Service
public class EffortTracker {

	private String name;
	
	private String description;
	
	private int hours;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
}

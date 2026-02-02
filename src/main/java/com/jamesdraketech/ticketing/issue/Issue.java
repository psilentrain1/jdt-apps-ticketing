package com.jamesdraketech.ticketing.issue;

import java.util.UUID;
import java.time.Instant;

public class Issue {

	public void create(UUID creator, String title, String description, int category) {
		Instant now = Instant.now();
		UUID issue_id = UUID.randomUUID();
		String issue_id_string = issue_id.toString();
		
	}
	
	public void assign_issue(UUID issue, UUID assignee) {
		Instant now = Instant.now();
	}
	
	public void prioritize_issue(UUID issue, int priority) {
		Instant now = Instant.now();
	}
	
	public void categorize_issue(UUID issue, int category) {
		Instant now = Instant.now();
	}
	
	public void delete(UUID id) {
		Instant now = Instant.now();
	}
}

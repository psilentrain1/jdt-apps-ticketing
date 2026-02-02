package com.jamesdraketech.ticketing.issue;

import java.time.Instant;
import java.util.UUID;

public class Comment {
	public void create(UUID issue, UUID user, String content, String attachments) {
		Instant now = Instant.now();
		UUID comment_id = UUID.randomUUID();
		String comment_id_string = comment_id.toString();
	}
}

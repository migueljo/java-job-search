package com.migueljo.jobsearch;

import com.google.gson.annotations.SerializedName;

public class JobPosition {
	private String id;
	private String type;
	private String url;
	@SerializedName("created_at")
	private String createdAt;
}

package com.migueljo.jobsearch.api;

import com.migueljo.jobsearch.JobPosition;
import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

@Headers("Accept: application/json")
public interface APIJobs {

	@RequestLine("GET /positions.json")
	List<JobPosition> jobs(@QueryMap Map<String, Object> queryMap);
}

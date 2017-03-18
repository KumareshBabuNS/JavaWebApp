package com.javaWebAppByZay.responseDTOs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.javaWebAppByZay.attributes.Results;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ZipCodeResponse {
	private String status;
	private Results[] results;

	public ZipCodeResponse() {
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Results[] getResults() {
		return results;
	}

	public void setResults(Results[] results) {
		this.results = results;
	}
}
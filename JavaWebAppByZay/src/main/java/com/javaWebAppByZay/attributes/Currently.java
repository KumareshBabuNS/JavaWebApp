package com.javaWebAppByZay.attributes;

public class Currently {
	private Long time;
	private String summary;
	private String temperature;

	public Currently() {
	}

	public Long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
}

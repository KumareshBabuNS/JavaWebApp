package com.javaWebAppByZay.responseDTOs;

public class ResponseMsgs {
	private String msg = "Successful!";
	private String date = "Invalid Zip Code!";
	private String city = "Invalid Zip Code!";
	private String temp = "Invalid Zip Code!";
	private String summary = "Invalid Zip Code!";

	public ResponseMsgs(String msg) {
		this.msg = msg;
	}

	public ResponseMsgs(String date, String city, String temp, String summary) {
		this.date = date;
		this.city = city;
		this.temp = temp;
		this.summary = summary;
	}

	public String getMsg() {
		return msg;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
}
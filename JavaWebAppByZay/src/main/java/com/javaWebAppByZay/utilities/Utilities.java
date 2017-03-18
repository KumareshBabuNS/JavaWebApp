package com.javaWebAppByZay.utilities;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.javaWebAppByZay.attributes.Location;
import com.javaWebAppByZay.attributes.Results;
import com.javaWebAppByZay.responseDTOs.WeatherResponse;
import com.javaWebAppByZay.responseDTOs.ZipCodeResponse;

public class Utilities {
	private static final Logger log = LoggerFactory.getLogger(Utilities.class);

	public static boolean validateZip(String zipCode) {
		if (zipCode.length() != 5)
			return false;
		try {
			int result = Integer.parseInt(zipCode);
		} catch (Exception e) {
			log.info("failed to parse zipCode!");
			return false;
		}
		return true;
	}

	@SuppressWarnings("deprecation")
	public static String getTime(Long time) {
		Date d = new Date(time * 1000);
		log.info(d.toString());
		return d.toString();
	}

	public static Results fetchLatAndLong(String zipCode) {
		String url = "http://maps.googleapis.com/maps/api/geocode/json?address=" + zipCode;
		RestTemplate rt = new RestTemplate();
		ZipCodeResponse response1 = rt.getForObject(url, ZipCodeResponse.class);
		log.info("Status : " + response1.getStatus());
		if (response1.getStatus().equals("OK")) {
			for (Results result : response1.getResults()) {
				return result;
			}
		}
		return null;
	}

	// you must create a darksky account in order to obtain an apiKey to use their services
	public static WeatherResponse fetchWeather(Location loc) {
		RestTemplate rt = new RestTemplate();
		// create a darksky account and replace this null key with your key
		String apiKey = null;
		String url = "https://api.darksky.net/forecast/" + apiKey + "/" + loc.getLat() + "," + loc.getLng();
		WeatherResponse wr = rt.getForObject(url, WeatherResponse.class);
		log.info(wr.toString());
		return wr;
	}
}
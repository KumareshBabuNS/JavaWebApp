# JavaWebApp
WeatherApp endpoint written in Java using Spring Boot that returns current weather conditions. This project uses the full CiCd cycle. Eclipse -> Github -> Jenkins -> Jmeter -> Pivotal Cloud Foundry

Import this project as a Maven Project, run it locally, and test the endpoint by changing the zip code on the following url:
http://localhost:8080/zaysServices/weatherApp?zipCode=30032

In order for this app to work, you must create a DarkSky account for an api key, and supply it to the Utilities class in the  utilities package. I have removed my api key for the DarkSky web service call, so it will throw a 404 error without this key.

Best,
Zay

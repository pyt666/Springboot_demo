package com.example.entity;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherdata = new WeatherData();
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherdata);
		weatherdata.setMeasurements(80, 65, 30.4f);
		weatherdata.setMeasurements(82, 80, 29.4f);
		weatherdata.setMeasurements(83, 90, 27.4f);
	}

}

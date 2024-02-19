package iot;

public class Sensor {
	float temp;
	float hum;
	int ad;
	int type_weather;
	
	public String weather(int i) {
		if(i == 0) 
			return "맑음";
		else if(i == 1) 
			return "비";
		else if(i == 2)
			return "눈";
		else
			return null;
	}
}

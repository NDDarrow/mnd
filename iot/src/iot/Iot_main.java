package iot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Iot_main {
	
	
	public static void main(String[] args) {
		Sensor sensor = new Sensor();
		sensor.temp = 12.4f;
		sensor.hum = 67.9f;
		sensor.ad = 17;
		sensor.type_weather = 0;
		home_app window = new window(sensor);
		home_app air_cleaner = new air_cleaner(sensor);
		home_app dehumid = new dehumidifier(sensor);
		home_app aircon = new airCon(sensor);
		
		
		List<home_app> appList = new ArrayList();
		appList.add(window);
		appList.add(air_cleaner);
		appList.add(dehumid);
		appList.add(aircon);
		
		
		Iot_main(appList, sensor);
		
		
		
		
		

	}
		public static void Iot_main(List<home_app> list, Sensor sensor) {
			Scanner scan = new Scanner(System.in);
			Controller cont = new Controller();
			
			menu.menu(sensor);
			cont.process(scan.nextInt(), list, sensor);
		}
}

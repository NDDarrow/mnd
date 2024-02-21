package iot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Iot_main {
	
	static Sensor sensor = new Sensor();
	static total_app TA = new total_app();
	public static Scanner scan = new Scanner(System.in);
	static Controller cont = new Controller();
	
	public static void main(String[] args) {
		
		sensor.temp = 30f;
		sensor.hum = 67.9f;
		sensor.ad = 30;
		sensor.type_weather = 0;
		
		Iot_main(TA, sensor);	
		
		
		 
		}
		public static void Iot_main(total_app ta, Sensor sensor) {
			cont.process(ta, sensor);
		}
}

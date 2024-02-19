package iot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Iot_main {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Sensor sensor = new Sensor();
		sensor.temp = 12.4f;
		sensor.hum = 67.9f;
		sensor.ad = 17;
		sensor.type_weather = 0;
		home_app window = new window(sensor);
		home_app air_cleaner = new air_cleaner(sensor);
		home_app dehumid = new dehumidifier(sensor);
		
		
		List<home_app> appList = new ArrayList();
		appList.add(window);
		appList.add(air_cleaner);
		appList.add(dehumid);
		
		System.out.println("현재 기상상황은\n온도 : " + sensor.temp+"\n습도 : "+sensor.hum
		+"\n미세먼지 농도 : " + sensor.ad+"㎍/㎥\n기상 상황 : " + sensor.weather(sensor.type_weather));
		System.out.println();
		System.out.println();
		System.out.println("필요하신 메뉴를 선택세요\n1.가전제품 상황조회\n2.온도변경\n3.습도변경\n4.미세먼지 농도변경\n5.기상 상황변경");
		
		Controller cont = new Controller(scan.nextInt(), appList, sensor);
		
		

	}

}

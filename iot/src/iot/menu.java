package iot;

public class menu {
	public static void menu(Sensor sensor) {
		System.out.println("현재 기상상황은\n온도 : " + sensor.temp+"\n습도 : "+sensor.hum
				+"\n미세먼지 농도 : " + sensor.ad+"㎍/㎥\n기상 상황 : " + sensor.weather(sensor.type_weather));
				System.out.println();
				System.out.println();
				System.out.println("필요하신 메뉴를 선택세요\n1.가전제품 상황조회\n2.온도변경\n3.습도변경\n4.미세먼지 농도변경\n5.기상 상황변경\n6.종료");
	}
}

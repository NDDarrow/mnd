package iot;

public class window implements home_app{
	int stat;
	boolean work = false;

	public window(Sensor sensor) {
		this.stat = sensor.type_weather;
		action(sensor);
	}

	
	@Override
	public void action(Sensor sensor) {
		if(sensor.type_weather == 0 && sensor.temp <= 25 && sensor.temp >= 5)
			work = true;
		else work = false;
		System.out.println(toString());
	}
	public String toString() {
		if( work )
			return "창문이 열려있습니다";
		else
			return "창문이 닫혀있습니다";
	}
}

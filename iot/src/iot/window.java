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
		if(stat == 0)
			work = false;
		else if( stat == 1 )
			work = true;
		else if( stat == 2 )
			work = true;
	}
	public String toString() {
		if( !work )
			return "창문이 닫혀있습니다";
		else
			return "창문을 열었습니다";
	}
}

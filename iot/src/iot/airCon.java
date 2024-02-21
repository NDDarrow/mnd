package iot;

public class airCon implements home_app{
	boolean work = false;
	public airCon() {
		
	}
	
	@Override
	public void action(Sensor sensor) {
		if(sensor.temp >= 30)
			work = true;
		else work = false;
		System.out.println(toString());
	}
	public String toString() {
		if( !work )
			return "에어콘이 작동중이지 않습니다";
		else
			return "에어콘이 작동중입니다";
	}
}

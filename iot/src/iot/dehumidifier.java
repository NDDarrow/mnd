package iot;

public class dehumidifier implements home_app{
	boolean work = false;
	float hum;
	public dehumidifier(Sensor sensor) {
		this.hum = sensor.hum;
		action(sensor);
	}
	@Override
	public void action(Sensor sensor) {
		if(sensor.hum > 50.0) 
			this.work =true;
		else work = false;
		System.out.println(toString());
		
	}
	public String toString() {
		if( !work )
			return "제습기가 작동중이지 않습니다";
		else
			return "제습기가 작동중입니다";
	}

}

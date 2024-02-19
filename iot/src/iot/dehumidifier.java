package iot;

public class dehumidifier implements home_app{
	boolean work = false;
	float hum;
	public dehumidifier(Sensor sensor) {
		this.hum = sensor.hum;
	}
	@Override
	public void action(Sensor sensor) {
		
		
	}
	public String toString() {
		if( !work )
			return "제습기가 작동중이지 않습니다";
		else
			return "제습기가 작동중입니다";
	}

}

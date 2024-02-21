package iot;

public class air_cleaner implements home_app{
	boolean work = false;
	
	public air_cleaner() {
	}
	
	@Override
	public void action( Sensor sensor) {
		if(sensor.ad > 25) 
			work = true;
		else work = false;
		System.out.println(toString());
		
	}
	public String toString() {
		if( !work )
			return "공기청정기가 작동중이지 않습니다";
		else
			return "공기청정기가 작동중입니다";
	}
}

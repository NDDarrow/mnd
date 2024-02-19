package iot;

import java.util.List;
import java.util.Scanner;

public class Controller {
	Controller(int i, List<home_app> list, Sensor sensor) {
		Scanner scan = new Scanner(System.in);
		if( i == 1) {
			for(home_app element : list)
				System.out.println(element.toString());
		}else if( i == 2) {
			sensor.temp = scan.nextFloat();
			for(home_app element :list)
				element.action(sensor);
		}
	}
}

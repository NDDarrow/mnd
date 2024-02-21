package iot;


import java.util.List;
import java.util.Scanner;

public class Controller {


    void process( total_app ta, Sensor sensor) {
    	ta.getAppList().stream().forEach(app -> app.action(sensor));
    }
}



//for( home_app element : ta.appList) {
//	element.action(sensor);
//}
package iot;


import java.util.List;
import java.util.Scanner;

public class Controller {
    Scanner scan = new Scanner(System.in);

    void process(int i, List<home_app> list, Sensor sensor) {
        if (i == 1) {
            for (home_app element : list)
                System.out.println(element.toString());
            System.out.println();
            menu.menu(sensor);
            process(scan.nextInt(), list, sensor);
        } else if (i == 2) {
            System.out.println("온도 재설정(-30이상 50이하)");
            float temp = scan.nextFloat();
            if (temp >= -30 && temp <= 50) {
                sensor.temp = temp;
                for (home_app element : list)
                    element.action(sensor);
                menu.menu(sensor);
                process(scan.nextInt(), list, sensor);
            } else {
                System.out.println("잘못된 온도입니다");
                process(i, list, sensor);
            }
        } else if (i == 3) {
            System.out.println("습도 재설정(0.0~100.0)");
            float humidity = scan.nextFloat();
            if (humidity >= 0.00 && humidity <= 100.0) {
                sensor.hum = humidity;
                for (home_app element : list)
                    element.action(sensor);
                menu.menu(sensor);
                process(scan.nextInt(), list, sensor);
            } else {
                System.out.println("잘못된 습도입니다");
                process(i, list, sensor);
            }
        } else if (i == 4) {
            System.out.println("미세먼지 농도 재설정(0 ~ 100)");
            int dust = scan.nextInt();
            if (dust >= 0 && dust <= 100) {
                sensor.ad = dust;
                for (home_app element : list)
                    element.action(sensor);
                menu.menu(sensor);
                process(scan.nextInt(), list, sensor);
            } else {
                System.out.println("잘못된 미세먼지 농도입니다");
                process(i, list, sensor);
            }
        } else if (i == 5) {
            System.out.println("기상 상황변경 (0.맑음 1.비 2.눈)");
            int weatherType = scan.nextInt();
            if (weatherType == 0 || weatherType == 1 || weatherType == 2) {
                sensor.type_weather = weatherType;
                for (home_app element : list)
                    element.action(sensor);
                menu.menu(sensor);
                process(scan.nextInt(), list, sensor);
            } else {
                System.out.println("잘못된 기상 상황입니다");
                process(i, list, sensor);
            }
        } else if(i == 6){
        	System.out.println("시스템 종료");
        } else {
        	process(1, list,sensor);
        }
    }
}




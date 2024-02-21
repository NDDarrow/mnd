package iot;

import java.util.Arrays;
import java.util.List;

public class total_app {
	private home_app window = new window();
	private home_app dehumid = new dehumidifier();
	private home_app airCon = new airCon();
	private home_app air_cleaner = new air_cleaner();
	public home_app getWindow() {
		return window;
	}
	public void setWindow(home_app window) {
		this.window = window;
	}
	public home_app getDehumid() {
		return dehumid;
	}
	public void setDehumid(home_app dehumid) {
		this.dehumid = dehumid;
	}
	public home_app getAirCon() {
		return airCon;
	}
	public void setAirCon(home_app airCon) {
		this.airCon = airCon;
	}
	public home_app getAir_cleaner() {
		return air_cleaner;
	}
	public void setAir_cleaner(home_app air_cleaner) {
		this.air_cleaner = air_cleaner;
	}
	public List<home_app> getAppList() {
		return appList;
	}
	public void setAppList(List<home_app> appList) {
		this.appList = appList;
	}
	private List<home_app> appList = Arrays.asList(window, air_cleaner, dehumid, airCon);
}

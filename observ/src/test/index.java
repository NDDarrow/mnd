package test;

import obj._subject;
import obj.buddy;

public class index {

	public static void main(String[] args) {
		_subject gyerim = new _subject();
		buddy minsu = new buddy("minsu", 10000);
		buddy garam = new buddy("garam");
		buddy jaehong = new buddy("jaehong");
		buddy dahui = new buddy("dahui");
		
		
		gyerim.setObserver(minsu);
		gyerim.setObserver(garam);
		gyerim.setObserver(dahui);
		
		gyerim.donationObserver(minsu);
		gyerim.updateObserver(" 알람 확인");
		
		gyerim.removeObserver(minsu);
		
		gyerim.updateObserver(" 알람 확인");
		
		gyerim.donationObserver();
		
		
		
	}

}

package test;

import obj._subject;
import obj.buddy;

public class index {

	public static void main(String[] args) {
		_subject NDD = new _subject();
		buddy minsu = new buddy("minsu");
		buddy garam = new buddy("garam");
		buddy dahui = new buddy("dahui");
		
		NDD.setObserver(minsu);
		NDD.setObserver(garam);
		NDD.setObserver(dahui);
		
		NDD.updateObserver(" 알람 확인");
		
		NDD.removeObserver(minsu);
		
		NDD.updateObserver(" 알람 확인");
		
		
	}

}

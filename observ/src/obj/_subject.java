package obj;

import java.util.ArrayList;
import java.util.List;

public class _subject implements subject{
	private List<buddy> subList = new ArrayList<>();
	

	@Override
	public void setObserver(buddy bud) {
		System.out.println( bud.name + "가 구독자가 되셨습니다");
		subList.add(bud);
		
	}

	@Override
	public void removeObserver(buddy bud) {
		subList.remove(bud);
	}

	@Override
	public void updateObserver(String ment) {
		System.out.println(subList.size() + "명의 구독자에게 알람 발사");
		subList.forEach(bud -> bud.update( bud.name + ment));
	}
	

	

}

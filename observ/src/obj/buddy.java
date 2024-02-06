package obj;

public class buddy implements Observer{
	String name;
	
	public buddy(String name){
		this.name = name;
	}
	@Override
	public void update(String msg) {
		System.out.println(msg);
	}
	
	
	
}

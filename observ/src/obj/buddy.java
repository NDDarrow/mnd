package obj;

public class buddy implements Observer{
	String name;
	int M = 0;
	public buddy(String name) {
		this.name=name;
	}
	
	public buddy(String name, int M){
		this.name = name;
		this.M = M;
	}
	@Override
	public void update(String msg) {
		System.out.println(msg);
	}
	@Override
	public void check() {
		System.out.println(name + "님의 기부금액 " + M +"원");
		
	}
	
	
	
}

package ch05;

interface RemoconAble{
	public void 초록버튼();
	public void 빨간버튼();
}

class Remocon{
	
}

class Samsung extends Remocon implements RemoconAble{

	@Override
	public void 초록버튼() {
		System.out.println("전원켜짐");
	}

	@Override
	public void 빨간버튼() {
		System.out.println("전원꺼짐");
	}
	
}

class LG extends Remocon implements RemoconAble{

	@Override
	public void 초록버튼() {
		System.out.println("전원켜짐");
	}

	@Override
	public void 빨간버튼() {
		System.out.println("전원꺼짐");
	}
	
}

public class Example05 {

	public static void main(String[] args) {
		LG l1 = new LG();
		LG l2 = new LG();
		Samsung s1 = new Samsung();
		Samsung s2 = new Samsung();
		
		l1.빨간버튼();

	}

}

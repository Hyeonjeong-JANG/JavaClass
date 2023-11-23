package ch02;

public class MethodEx02 {

	//void는 리턴(돌려주지)하지 않겠다. 라는 의미
	static int add() {// 호출이 되면 중괄호 내부가 실행된다. 이때 stack 공간이 메모리에 만들어진다.
		int sum = 5 + 6;
		//System.out.println(sum);
		return sum;//return하지 않는다면 add의 stack이 날아가버렸기 때문에 sum값을 찾을 방법이 없음. return했기 때문에 main에서 사용할 수 있는 것이다.
		//return되는 값과 타입의 값이 같아야 한다. static int add()에서의 int와 return되는 sum의 타입이 같아야 한다는 말이다.
	}// return 할거면 return type을 적어주면 되고 return하지 않을거면 void을 쓰면 된다.
	
	public static void main(String[] args) {
		int result = add();// add() 메서드 호출
		System.out.println(result);
	}

}

// 
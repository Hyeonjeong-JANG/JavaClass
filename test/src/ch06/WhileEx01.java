package ch06;

//for은 끝이 있고(내가 끄기 전까지 켜져있음, 형광등 컴퓨터)
//while은 끝이 없음(내가 끄지 않아도 꺼짐, 전자레인지, 세탁기)
public class WhileEx01 {

	public static void main(String[] args) {
		int n = 1;
		
		//괄호 안에는 조건문만 들어가면 됨
		while(n < 10) {
			System.out.println(n);//아래의 n = n + 1; 없이 실행시키면 무한으로 찍혀서 실행하면 안 돼.
			n = n + 1;
		}
	}

}

package ch01;

// VarEx05의 메모리 -> main

// Note의 메모리 ->  X
class Note {
	int price = 2000;
	
}

public class VarEx05 {

	public static void main(String[] args) {
		Note note1 = new Note(); // heap 공간에 Note 클래스가 가지고 있는 모든 데이터를 할당해!!!(대신 static은 제외하고)
		Note note2 = new Note(); // heap 공간에 저장됨.
		Note note3 = new Note(); // heap 공간에 저장됨.
		
		// heap에 저장하면 장점이 
		// static이 아니니까 원하는 시점에 동적으로 만들 수 있고(new를 붙여서 계속 만들어낼 수 있다.)
		// 클래스를 하나만 만들어 놓고 뉴해서 메모리에 할당하면 된다.

		int age = 25; // main의 stack에 저장됨.
		System.out.println(age);
		System.out.println(note1.price);
		System.out.println(note2.price);
		System.out.println(note3.price);
		
		note3.price = 30000;
		System.out.println(note1.price);
		System.out.println(note2.price);
		System.out.println(note3.price);
	}

}

package kr.co.ezen;

public class MethodTest {
	
	int a;
	boolean b = true;
	
	public MethodTest() {
			
	}
	
	public void printDan(int dan) {
		System.out.println(dan *1);
		System.out.println(dan *2);
		System.out.println(dan *3);
		System.out.println(dan *4);
		System.out.println(dan *5);
		System.out.println(dan *6);
		System.out.println(dan *7);
		System.out.println(dan *8);
		System.out.println(dan *9);
	}
	
	public void printScore(String name, int score) {
		System.out.println(name + " " + score + "��");
	}
	
	public void callName(String name) {
		System.out.println("�ȳ��ϼ���, "+ name);
	}
	
	public void sayHello() {
		System.out.println("Hello~");
	}
	
	public void sitDown() {
		System.out.println("�� �ڸ��� ��� ����");
		sayHello();
	}
	
	public void stand() {
		
		System.out.println("����ȯ ���Ķ�");
		
	}
	
	public void sleep() {
		System.out.println("public: ���������ڷ� ������Ʈ ��ü���� sleep �޼��尡 sleep������ ȣ��� �� ������ �ǹ���.");
		System.out.println("void: ��ȯ���̶� �ϰ�, �̴� ��ȯ�Ǵ� �������� �ڷ����� �ǹ��Ѵ�. void�� ��ȯ�Ǵ� �����Ͱ� ���ٴ� ���� �ǹ��Ѵ�.");
		
		System.out.println("sleep: �޼����� �̸��̰�, ���߿� �޼��带 ȣ���� �� �� �̸��� ���� �����ν� �޼��� ���� �ȿ� �ִ� �ڵ带 �����ϰ� ��");
		
		System.out.println("(): �Ķ����, �Ű����� �����ϴ� ������ ��ġ ������ �����ϵ� �ۼ��ϸ� ��. �Ķ���Ͱ� �� �� �̻��� ���� ,�� �����ڷ� �ؼ� ������ ����.");
		
		System.out.println("(): �޼����� ����. �޼��� ȣ�� �� �����ϰ� ���� �ڵ带 �ۼ�����.");
		
		System.out.println("�޼��� ȣ��: �޼��带 ����ϴ� ���� �ǹ�. ,������ �޼������ ���� �Ұ�ȣ�� Ĩ�ϴ�.");
		
	}
	
}
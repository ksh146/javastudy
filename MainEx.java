package kr.co.ezen;

public class MainEx {
	public static void main(String[] args) {
		
		MethodTest mt1 = new MethodTest();
		
		MethodTest mt2 = new MethodTest();
		
		mt1.stand();
		mt1.sleep();
		mt1.sayHello();
		
		mt2.sitDown();
		
		mt2.callName("kim");
		mt2.callName("lee");
		
		mt2.printDan(3);
		
		mt2.printScore(new String("ȫ�浿"), 55);
		mt2.printScore("������", 58);
		mt2.printScore("���", 100);
	}

}
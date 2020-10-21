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
		
		mt2.printScore(new String("È«±æµ¿"), 55);
		mt2.printScore("±èÀ¯½Å", 58);
		mt2.printScore("°è¹é", 100);
	}

}
package kr.co.ezen;

import com.naver.MethodTest2;
import com.naver.MethodTest3;

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
		
		Test12 t12 = new Test12();
		t12.sayHello();
		t12.printScore("ksh", 34);
		
		MethodTest2 mt5 = new MethodTest2();
		int re1 = mt5.giveMeTheMoney();
		
		MethodTest2 mt6 = new MethodTest2();
		int re2 = mt6.giveMeTheMoney();
		
		int re3 = mt5.giveMeTheMoney();
		
		re2 = mt6.giveMeTheMoney();
		
		System.out.println(mt5.giveMeTheMoney());
		
		MethodTest3 mt7 = new MethodTest3();
		Test12 re4 = mt7.getTest12();
		
		
	}
	
}

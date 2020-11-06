package kr.co.ezen;

import com.naver.Bow;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Spear;


public class MainEx {
	public static void main(String[] args) {
		
		Monster mon = new Monster();
		
		Bow bow = new Bow();
		
		Hero hero = new Hero(bow);
		
		hero.attack(mon);
		hero.attack(mon);
		hero.attack(mon);
		
		Sword sword = new Sword();
		hero.attack(sword, mon);
		hero.attack(sword, mon);
		
		hero.attack(mon);
		
		Spear spear = new Spear();
		
		hero.setSpear(spear);
		
		hero.attackBySpear(mon);
				
	}

}

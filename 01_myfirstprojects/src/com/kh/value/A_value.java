package com.kh.value;

public class A_value {

	//시급과 근무시간과 근무일수를 곱해 월급을 계산해주는 매서드
	public void printvalue() {
		System.out.println("=== 변수 사용 전 ===");
		System.out.println("시급 : 8500");
		System.out.println("근무시간 : 6");
		System.out.println("근무 일수: 5");
		
		System.out.println("한동희 : " +8500 * 6 * 5);
		System.out.println("한동희1 : " +8500 * 6 * 5);
		System.out.println("한동희2 : " +8500 * 6 * 5);
		
		int pay = 8500;
		int time = 6;
		int day = 5;
		
		System.out.println("한동희 : " + pay * time * day);
		System.out.println("한동희1 : " + pay * time * day);
		System.out.println("한동희2 : " + pay * time * day);
	}
}

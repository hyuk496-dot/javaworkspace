package com.kh.operator;

import com.kh.practice.func.OperatorPractice;

public class Run {
	public static void main(String[] args) {

		A_Arithmetic ai = new A_Arithmetic();
		// ai.method();

		B_InDecrease bi = new B_InDecrease();
		// bi.method1();

		C_Compound ci = new C_Compound();
		// ci.method();

		D_Logical di = new D_Logical();
		// di.method1();
		// di.method4();

		E_LogicalNegation ei = new E_LogicalNegation();
		// di.method1();

		F_Triple fi = new F_Triple();
		// fi.quiz();

		OperatorPractice op = new OperatorPractice();
		// op.practice1();
		op.practice2();
	}
}

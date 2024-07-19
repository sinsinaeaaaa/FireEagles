/*
작성자: 이소희, 이신애
목적 : 병원 관리 프로젝트 - Main
         번호, 진료코드, 입원일수, 나이를 입력받아 아래의 처리 조건에 의하여 계산하는 프로그램.
환경 : windowv 11, JDK 17.0.11, Eclipse IDE for JAVA Developers version = 2024.06
작성일 : 2024.07.19
*/

import java.util.ArrayList;
import java.util.List;

//import Calc;
//import Output;
//import Input;

public class Main {
	public static void main(String[] args) {
		List<Patient> list = new ArrayList<Patient>();
		Input input = new Input(list);
		input.input();
		
		Calc calc = new Calc(list);
		calc.calc();
		
		Sort sort = new Sort(list);
		sort.quickSort();
		
		Output output = new Output(list);
		output.print();
		
		System.out.println("Program is over ...");
	}
}

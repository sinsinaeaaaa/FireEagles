/*
작성자: 이소희, 이신애
목적 : 병원 관리 프로젝트 - Main
         번호, 진료코드, 입원일수, 나이를 입력받아 아래의 처리 조건에 의하여 계산하는 프로그램.
환경 : windowv 11, JDK 17.0.11, Eclipse IDE for JAVA Developers version = 2024.06
작성일 : 2024.07.19
*/

import java.util.List;

public class Output {
	private List<Patient> list;
	
	public Output(List<Patient> list) {
		this.list = list;
	}

	public void print() {
		this.labelPrint();
		for (Patient p : this.list) {
			System.out.println(p); // p.toString()
		}	
	}
	private void labelPrint() {
		System.out.println("                               <<병원관리 프로그램>> ");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("번호\t 진찰부서\t\t 진찰비\t\t 입원비\t\t 진료비");
		System.out.println("----------------------------------------------------------------------------------------");
	}

}

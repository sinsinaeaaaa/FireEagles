/*
작성자: 이소희, 이신애
목적 : 병원 관리 프로젝트 - Sort
         번호, 진료코드, 입원일수, 나이를 입력받아 아래의 처리 조건에 의하여 계산하는 프로그램.
환경 : windowv 11, JDK 17.0.11, Eclipse IDE for JAVA Developers version = 2024.06
작성일 : 2024.07.19
*/

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
	private List<Patient> list;
	
	public Sort(List<Patient> list) {
		this.list = list;
	}

	public void quickSort() {
		Collections.sort(this.list, new Comparator<Patient>() {

			@Override
			public int compare(Patient front, Patient back) {
				
				return front.getNum() - back.getNum(); // 오름차순
			}
			
		} );
	}
}

/*
작성자: 이소희, 이신애
목적 : 병원 관리 프로젝트 - Calc
         번호, 진료코드, 입원일수, 나이를 입력받아 아래의 처리 조건에 의하여 계산하는 프로그램.
환경 : windowv 11, JDK 17.0.11, Eclipse IDE for JAVA Developers version = 2024.06
작성일 : 2024.07.19
*/

import java.util.List;

public class Calc {
	private List<Patient> list;

	public Calc(List<Patient> list) {
		this.list = list;
	}

	public void calc() {
	/* 처리조건
	*	   1) 총입원비 = 1일 입원비 * 일수 
	*	   2) 입원비 = 총입원비 * 입원일수 할인비율
	*	   3) 진료비 = 진찰비 + 입원비
	*	   4) 
	*/	
		for(Patient p : this.list) {
			int totHosfee = hosfeeOfAge(p.getDays()) * p.getDays();
			int hosfee = (int) (totHosfee * discountRateOfDay(p.getDays()));
			int medfee = confeeOfAge(p.getAge()) + hosfee;
			String dep = deptName(p.getCode());

			p.setDep(dep);
			p.setConfee(confeeOfAge(p.getAge()));
			p.setHosfee(hosfee);
			p.setMedfee(medfee);
		}
		
	
	}
	
	String deptName (String code) { // 진찰코드에 따른 진찰부서명
		String department = null;
		switch (code) {
	        case "MI": department = "외과"; break;
	        case "NI": department = "내과"; break;
	        case "SI": department = "피부과"; break;
	        case "TI": department = "소아과"; break;
	        case "VI": department = "산부인과"; break;
	        case "WI": department = "비뇨기과"; break;
		}
		return department;
	}
	
	int confeeOfAge (int age) { // 나이에 따른 진찰비계산
		int fee = 0;
		if (age < 10) {
			fee = 7000;
        } else if (age < 20) {
        	fee = 5000;
        } else if (age < 30) {
        	fee = 8000;
        } else if (age < 40) {
        	fee = 7000;
        } else if (age < 50) {
        	fee = 4500;
        } else if (age >= 50) {
        	fee = 2300;
        }
		return fee;
	}

	int hosfeeOfAge (int days) { //일수에 따른 1일 입원비
		int hosfeeOneDay = 0;
		if (days <= 3) {
			hosfeeOneDay = 30000;
        } else if (days > 4) {
        	hosfeeOneDay = 25000;
        } 
		return hosfeeOneDay;
	}
	
	double discountRateOfDay (int days) { // 입원일수에 따른 할인 비율
		double rate = 0;
		if (days < 10) {
			rate = 1.0;
        } else if (days < 15) {
        	rate = 0.85;
        } else if (days < 20) {
        	rate = 0.80;
        } else if (days < 30) {
        	rate = 0.77;
        } else if (days < 100) {
        	rate = 0.72;
        } else if (days >= 100) {
        	rate = 0.68;
        }
		return rate;
	}
	
}

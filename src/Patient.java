/*
작성자: 이소희, 이신애
목적 : 병원 관리 프로젝트 - Patient
         번호, 진료코드, 입원일수, 나이를 입력받아 아래의 처리 조건에 의하여 계산하는 프로그램.
환경 : windowv 11, JDK 17.0.11, Eclipse IDE for JAVA Developers version = 2024.06
작성일 : 2024.07.19
*/

public class Patient {
	private int num;
	private String code;
	private int days;
	private int age;
	
	private String dep;
	private int confee;
	private int hosfee;
	private int medfee;

public Patient(int num, String code, int days, int age) {
		super();
		this.num = num;
		this.code = code;
		this.days = days;
		this.age = age;
	}

public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
}

public int getHosfee() {
	return hosfee;
}

public void setHosfee(int hosfee) {
	this.hosfee = hosfee;
}

public int getMedfee() {
	return medfee;
}

public void setMedfee(int medfee) {
	this.medfee = medfee;
}

public String getCode() {
	return code;
}

public int getDays() {
	return days;
}

public int getAge() {
	return age;
}
public void setDep(String dep) {
	this.dep = dep;
}
public String getDep() {
	return dep;
}
public void setConfee(int confee) {
	this.confee = confee;
}
public int getConfee() {
	return confee;
}

@Override
	public String toString() {
		return String.format(
				"%7d\t %5s\t %,10d\t %,10d\t%10d\t",
				num, dep,confee,hosfee,medfee);
	}
}

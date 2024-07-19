/*
작성자: 이소희, 이신애
목적 : 병원 관리 프로젝트 - Input
         번호, 진료코드, 입원일수, 나이를 입력받아 아래의 처리 조건에 의하여 계산하는 프로그램.
환경 : windowv 11, JDK 17.0.11, Eclipse IDE for JAVA Developers version = 2024.06
작성일 : 2024.07.19
*/

import java.util.List;
import java.util.Scanner;

public class Input {
	private List<Patient>list;
    private Scanner sc;
    private Patient[] array;
    private String[] data;

    public Input(List<Patient>list) {
        this.sc = new Scanner(System.in);
        this.list = list;
    }

    public void input() {
        String io = null;
        int index = 0;
        do {
            System.out.print("번    호 : ");
            int num = Integer.parseInt(sc.nextLine());
            System.out.print("진료코드 : ");
            String code = sc.nextLine();
            System.out.print("입원일수 : ");
            int days = Integer.parseInt(sc.nextLine());
            System.out.print("나    이 : ");
            int age = Integer.parseInt(sc.nextLine());
            Patient p = new Patient (num, code, days, age);
            this.list.add(p);
            //array[index] = new Patient(num, code, days, age);
            String input = getInput(num, code, days, age);
//            data[index] = input;
            index++;
            System.out.print("입력/출력(I/O)?: ");
            io = sc.nextLine();
        } while (io.equalsIgnoreCase("I"));
    }

    private String getInput(int num, String code, int days, int age) {
        return String.format("%5d%s%10d%5d", num, code, days, age);
    }
}
package com.ohgiraffers.section01.level02.normal;

public class Application4 {
    public static void main(String[] args) {
        /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */
        int random[] = new int[7];
        for (int i = 0; i < 7; i++) {
            random[i] = (int) (Math.random() * 50); //난수 생성
        }

        int min = random[0];
        int count = 1;

        for (int j = 0; j < 6; j++) {
            for (int i = j + 1; i < 7; i++) {
                if (random[j] > random[i]) {

                    min = random[j];
                    random[j] = random[i];
                    random[i] = min;
                } else if (random[j] == random[i]) {
                    count = 0;
                    break;
                }
            }
            if (count == 0) {
                break;
            }


        }

        if (count == 0) {
            System.out.println("중복값 존재");
        }
        if (count > 0) {
            for (int b = 0; b < 7; b++) {
                System.out.print(random[b] + " ");
            }

        }
    }

}
package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {

        /*
         * 사용자가 입력한 값이 배열에 있는지 검색하여
         * 있으면 "OOO 치킨 배달 가능", 없으면 "OOO 치킨은 없는 메뉴입니다."를
         * 출력하세요.
         * 단, 치킨메뉴가 들어가 있는 배열은 본인이 스스로 정하세요
         *
         * ex.
         * 치킨 이름을 입력하세요 : 양념     치킨 이름을 입력하세요 : 불닭
         * 양념치킨 배달 가능              불닭치킨은 없는 메뉴입니다.
         * */

        String menu[] = {"후라이드", "양념", "간장", "마늘", "소떡소떡", "감자튀김"};
        System.out.println("메뉴판");
        for (int i = 0; i < menu.length; i++){
            System.out.println(">>"+menu[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴를 입력하세요 : ");
        String order = sc.nextLine();
        int count = 0;

        for (int i = 0; i < menu.length; i++) {
            if (order.equals(menu[i])) {
                System.out.println(menu[i]+" 배달 가능");
                count++;

            }
        }
        if(count==0){
            System.out.println(order+"은(는) 없는 메뉴입니다.");
        }
    }
}
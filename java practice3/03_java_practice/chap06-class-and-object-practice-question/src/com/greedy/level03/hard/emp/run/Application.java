package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("번호를 입력해주세요 : ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.print("소속을 입력해주세요 : ");
        String dept = sc.nextLine();
        System.out.print("직위를 입력해주세요 : ");
        String job = sc.nextLine();
        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별을 입력해주세요 : ");
        String a = sc.nextLine();
        char gender = a.charAt(0);
        System.out.print("월급을 입력해주세요 : ");
        int salary = sc.nextInt();
        System.out.print("상여금을 입력해주세요 : ");
        double bonusPoint = sc.nextDouble();
        sc.nextLine();
        System.out.print("전화번호를 입력해주세요 : ");
        String phone = sc.nextLine();
        System.out.print("주소를 입력해주세요 : ");
        String address = sc.nextLine();

        EmployeeDTO em = new EmployeeDTO();

        em.setNumber(number);
        em.setName(name);
        em.setDept(dept);
        em.setJob(job);
        em.setAge(age);
        em.setGender(gender);
        em.setSalary(salary);
        em.setBonusPoint(bonusPoint);
        em.setPhone(phone);
        em.setAddress(address);

        System.out.println(em.getNumber());
        System.out.println(em.getName());
        System.out.println(em.getDept());
        System.out.println(em.getJob());
        System.out.println(em.getAge());
        System.out.println(em.getGender());
        System.out.println(em.getSalary());
        System.out.println(em.getBonusPoint());
        System.out.println(em.getPhone());
        System.out.println(em.getAddress());





    }

}

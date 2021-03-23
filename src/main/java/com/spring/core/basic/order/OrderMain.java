package com.spring.core.basic.order;

import com.spring.core.basic.config.AppConfig;
import com.spring.core.basic.member.Grade;
import com.spring.core.basic.member.Member;
import com.spring.core.basic.member.MemberService;
import com.spring.core.basic.member.MemberServiceImpl;

public class OrderMain {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Member member1 = new Member(1l, "김철수", Grade.BASIC);
        Member member2 = new Member(2l, "박영희", Grade.VIP);

        memberService.join(member1);
        memberService.join(member2);
        // ---------------------- 회원 가입 --------------------------

        Order order = orderService.createOrder(1L, "삼겹살", 20000);
        System.out.println("order = " + order);
        System.out.println("order 최종지불액 : " + order.calculatePrice());
        Order order2 = orderService.createOrder(2L, "삼겹살", 20000);
        System.out.println("order2 = " + order2);
        System.out.println("order 2 최종지불액 : " + order2.calculatePrice());
    }
}

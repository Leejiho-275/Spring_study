package com.spring.core.basic.quiz.computer;

import org.springframework.stereotype.Component;

@Component
public class Mouse {

    private Computer computer;

    public Mouse() {
        this.computer = computer;
    }

    public void info() {
        System.out.println("로지텍 마우스");
    }
}

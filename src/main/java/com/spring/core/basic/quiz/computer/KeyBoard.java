package com.spring.core.basic.quiz.computer;

import org.springframework.stereotype.Component;

@Component
public class KeyBoard {

    private Computer computer;

    public KeyBoard() {
        this.computer = computer;
    }

    public void info() {
        System.out.println("리얼포스 키보드");
    }
}

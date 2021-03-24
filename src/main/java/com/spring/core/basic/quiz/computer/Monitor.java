package com.spring.core.basic.quiz.computer;

import org.springframework.stereotype.Component;

@Component
public class Monitor {

    private Computer computer;

    public Monitor() {
        this.computer = computer;
    }

    public void info(){
        System.out.println("삼성 모니터");
    }
}

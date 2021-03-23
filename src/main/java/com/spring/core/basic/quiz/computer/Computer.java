package com.spring.core.basic.quiz.computer;

public class Computer {

    private Monitor monitor;
    private Mouse mouse;
    private KeyBoard keyBoard;

    public Computer(Monitor monitor, Mouse mouse, KeyBoard keyBoard) {
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyBoard = keyBoard;
    }

    public void computerInfo() {
        System.out.println("===== 컴퓨터 정보 =====");
        monitor.info();
        mouse.info();
        keyBoard.info();
    }
}

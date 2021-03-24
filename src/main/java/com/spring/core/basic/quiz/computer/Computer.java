package com.spring.core.basic.quiz.computer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Computer {

//    @Autowired
    private final Monitor monitor;
//    @Autowired
    private final Mouse mouse;
//    @Autowired
    private final KeyBoard keyBoard;

//    @Autowired
    public Computer(Monitor monitor, Mouse mouse, KeyBoard keyBoard) {
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyBoard = keyBoard;
    }

    /*
    @Autowired
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Autowired
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Autowired
    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }
*/

    public void computerInfo() {
        System.out.println("===== 컴퓨터 정보 =====");
        monitor.info();
        mouse.info();
        keyBoard.info();
    }
}

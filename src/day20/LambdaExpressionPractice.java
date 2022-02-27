package day20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.time.Instant;

public class LambdaExpressionPractice {
    public static void main(String[] args){
//        ActionListener actionListener = e -> {
//            System.out.println("At the tone, the time is "
//            + Instant.ofEpochMilli(e.getWhen()));
//            Toolkit.getDefaultToolkit().beep();
//        };
        Timer timer = new Timer(1000, e -> {
            System.out.println("At the tone, the time is "
            + Instant.ofEpochMilli(e.getWhen()));
            Toolkit.getDefaultToolkit().beep();
        });

        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

// output:
//        At the tone, the time is 2022-02-27T06:11:10.113Z
//        At the tone, the time is 2022-02-27T06:11:11.082Z
//        At the tone, the time is 2022-02-27T06:11:12.092Z
//        At the tone, the time is 2022-02-27T06:11:13.106Z
//        At the tone, the time is 2022-02-27T06:11:14.122Z
//        At the tone, the time is 2022-02-27T06:11:15.132Z
//        At the tone, the time is 2022-02-27T06:11:16.140Z
//
//        Process finished with exit code 0
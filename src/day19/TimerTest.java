package day19;

import javax.swing.*;

public class TimerTest {
    public static void main(String[] args){
        Timer timer = new Timer(10000, new TimePrinter());
        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

// output:
//        At the tone, the time is 2022-02-27T05:35:32.666Z
//        At the tone, the time is 2022-02-27T05:35:42.667Z
//        At the tone, the time is 2022-02-27T05:35:52.671Z
//
//        Process finished with exit code 0
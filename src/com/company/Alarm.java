package com.company;

import sun.awt.image.ImageWatched;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Nachi Penn on 11/23/2018.
 */
public class Alarm {
    public static LinkedList<LocalTime> alarms = new LinkedList();
    Scanner scanner = new Scanner(System.in);

    public void setAlarm() {
        int hour;
        int minute;

        System.out.println("what hour would you like your alarm to ring (0-23)?");
        hour = scanner.nextInt();

        System.out.println("what minute would you like your alarm to ring (0-59)?");
        minute = scanner.nextInt();

        System.out.printf("you set an alarm at %02d:%02d", hour, minute);
        System.out.println();

        alarms.add(LocalTime.of(hour,minute));
        //addAlarm(hour, minute);
    }

    public static void checkAlarm(LocalTime now) {
        for(int i = 0; i < alarms.size(); i++) {
            if (now.getHour() == alarms.peek().getHour() && now.getMinute() == alarms.peek().getMinute()){
                System.out.println("BEEP!!!!!");
            }
        }
    }
}
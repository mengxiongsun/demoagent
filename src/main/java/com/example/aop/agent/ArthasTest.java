package com.example.aop.agent;

public class ArthasTest {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        while (true) {
            Thread.sleep(2000);
            print(i++);
        }
    }
    public static void print(Integer content) {
        System.out.println("Main print: " + content);
    }
}

package ru.AndJava2020.Ex6;

public class Main {

    public static void main(String[] args) {
        MovableRectangle R=new MovableRectangle(0,0,100,100,10,10);
        System.out.println(R);
        R.moveUp();
        System.out.println(R);
    }
}

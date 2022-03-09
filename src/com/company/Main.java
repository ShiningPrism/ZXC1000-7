package com.company;
public class Main {
    public static void main(String[] args) {
        int ghoul;
        ghoul = 1000;
        System.out.println("1000-7=?");
        while(true) {
            int zxc = ghoul - 7;
            ghoul = zxc;
            if (zxc >= 0) {
                System.out.println(zxc + "-7=" + (zxc - 7));
            } else {
                System.exit(0);
            }
        }
    }
}

package oop.bank;

import java.util.Date;

public class ProgramBank {
    public static void main(String[] args) {
        Log log=new Log(new Date(System.currentTimeMillis()),123,"Client open an account",1000);
        System.out.println(log);
    }
}

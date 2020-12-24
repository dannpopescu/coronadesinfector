package com.danpopescu;

public class Main {

    public static void main(String[] args) {
        CoronaDisinfector coronaDisinfector = new CoronaDisinfector();
        coronaDisinfector.start(new Room());
    }
}

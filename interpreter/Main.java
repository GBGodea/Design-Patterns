package com.godea.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        Interpreter numInterpret = new StringToNumInterpreter();
        System.out.println(numInterpret.interpret("2 + 2 * 3 * 3 * 3 + 2 + 3 + 11 * 2"));
        Interpreter rimInterpret = new RimNumInterpreter();
        System.out.println(rimInterpret.interpret("XLXL"));
    }
}

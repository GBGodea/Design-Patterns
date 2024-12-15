package com.godea.behavioral.interpreter;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;

import java.util.ArrayList;

public class StringToNumInterpreter implements Interpreter {
    @Override
    public int interpret(String str) {
        return takeDataFromString(str);
    }

    private int takeDataFromString(String str) {
        RegularExpression reg = new RegularExpression("[a-zA-Z]");
        RegularExpression signsExpression = new RegularExpression("[-+*/]");
        if (reg.matches(str)) {
            System.err.println("Cant use string with a - z or A - Z");
        }

        StringBuilder builder = new StringBuilder();
        ArrayList<String> nums = new ArrayList<>();
        ArrayList<String> signs = new ArrayList<>();
        str = str.replaceAll(" ", "");

        for (int i = 0; i < str.length(); i++) {
            if (signsExpression.matches(String.valueOf(str.charAt(i)))) {
                signs.add(String.valueOf(str.charAt(i)));
                nums.add(String.valueOf(builder));
                builder.delete(0, builder.capacity());
                continue;
            }

            builder.append(str.charAt(i));

            if (i == str.length() - 1) {
                nums.add(String.valueOf(builder));
            }
        }

        if (signsExpression.matches(nums.get(0))) {
            nums.set(0, nums.get(0) + nums.get(1));
            nums.remove(1);
        }
        return cycle(nums, signs);
    }

    private int cycle(ArrayList<String> nums, ArrayList<String> signs) {
        for (int i = 0; i < nums.size(); i++) {
            if(nums.size() == 1) {
                break;
            }
            for (int j = 0; j < signs.size(); j++) {
                if (signs.get(j).equals("*") || signs.get(j).equals("/")) {
                    switch (signs.get(j)) {
                        case "*":
                            nums.set(j, String.valueOf(Integer.parseInt(nums.get(j)) * Integer.parseInt(nums.get(j + 1))));
                            nums.remove(j + 1);
                            signs.remove(j);
                            i = 0;
                            j = 0;
                            break;

                        case "/":
                            nums.set(j, String.valueOf(Integer.parseInt(nums.get(j)) / Integer.parseInt(nums.get(j + 1))));
                            nums.remove(j + 1);
                            signs.remove(j);
                            i = 0;
                            j = 0;
                            break;
                    }
                }
            }
            switch (signs.get(i)) {
                case "+":
                    nums.set(0, String.valueOf(Integer.parseInt(nums.get(i)) + Integer.parseInt(nums.get(i + 1))));
                    nums.remove(i + 1);
                    i = -1;
                    break;

                case "-":
                    nums.set(0, String.valueOf(Integer.parseInt(nums.get(i)) - Integer.parseInt(nums.get(i + 1))));
                    nums.remove(i + 1);
                    i = -1;
                    break;
            }
        }
        return Integer.parseInt(nums.get(0));
    }
}
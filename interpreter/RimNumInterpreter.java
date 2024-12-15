package com.godea.behavioral.interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RimNumInterpreter implements Interpreter {
    private static final Map<Character, Integer> romanMap = new HashMap<>();
    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }
    @Override
    public int interpret(String str) {
        return rimNumbersInterpret1(str.replaceAll(" ", ""));
    }

    private int rimNumbersInterpret1(String str) {
        int total = 0;
        int prevValue = 0;

//        int sumOfAllNums = 0;
//        for(int i = 0; i < str.length(); i++) {
//            sumOfAllNums += romanMap.get(str.charAt(i));
        /*
        * if(сумма всех элементов превышает сумму элемента, который существует в HashMap)
        *   то выбросить исключение --- Например LXLX - сумма элементов = 120, а значит C = 100 - 10 - то есть больше 90, и они больше С, а значит нужно выбросить исключение */
//        }

        for (int i = str.length() - 1; i >= 0; i--) {
            char currentChar = str.charAt(i);
            try {
                char previousChar = str.charAt(i - 1);
                if (!romanMap.containsKey(currentChar) || ((romanMap.get(previousChar) * 10)) <= romanMap.get(currentChar) || previousChar == currentChar) {
                    throw new IllegalArgumentException("Invalid Roman numeral: " + str);
                }
            } catch (IndexOutOfBoundsException ignored) {}

            int currentValue = romanMap.get(currentChar);

            // Проверка на недопустимые комбинации
            if (prevValue > currentValue) {
                total -= currentValue; // Вычитаем, если меньше
            } else {
                total += currentValue; // Прибавляем, если больше или равно
            }

            prevValue = currentValue;
        }

        return total;
    }

    private int rimNumbersInterpret(String str) {
        str.replaceAll(" ", "");
        /*
        if(число римской цифры меньше числа друугйо роимсокй цифры то делаю минус
        Иначе
        Прибавляю)

        1 и 1 = 1 + 1 = 2
        if(число больше или равно число)
            то прибавляд
        1 и 5 = 1 - 5 = 4 - беру абсолютное число
        Либо вычитаю из второго числа первое 5 - 1 = 4
        else
            вычитаю числа
        */

        List<Integer> ints = new ArrayList<Integer>();
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'I':
                    ints.add(1);
                    break;
                case 'V':
                    ints.add(5);
                    break;
                case 'X':
                    ints.add(10);
                    break;
                case 'L':
                    ints.add(50);
                    break;
                case 'C':
                    ints.add(100);
                    break;
                case 'D':
                    ints.add(500);
                    break;
                case 'M':
                    ints.add(1000);
                    break;
            }
        }
//        if (substructionFlag) {
//            num -= ints.get(i);
//            substructionFlag = false;
//        } else {
//            throw new IllegalArgumentException("You can't use this number");
//        }
        List<Integer> intsRim = new ArrayList<Integer>();
        boolean checker = true;
        int j = 1;
        for (int i = 1; i < ints.size(); i+=2) {
            while(checker) {
                if(ints.get(j - 1) == ints.get(j))
                    throw new IllegalArgumentException("You can't use this number");
                if(j == ints.size() - 1)
                    checker = false;
                j++;
            }

            if (ints.get(i - 1) >= ints.get(i)) {
                intsRim.add(ints.get(i - 1) + ints.get(i));
            } else {
                if ((ints.get(i - 1) * 10) <= ints.get(i)) {
                    throw new IllegalArgumentException("You can't use this number");
                }
                intsRim.add(Math.abs(ints.get(i - 1) - ints.get(i)));
            }
        }

        if((ints.size() - 1) % 2 == 0) {
            intsRim.add(ints.get(ints.size() - 1));
        }

        int num = 0;
        for(int i = 0; i < intsRim.size(); i++) {
            num += intsRim.get(i);
        }

        return num;
    }
}

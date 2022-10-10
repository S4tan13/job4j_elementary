package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (name.length() == 0) {
            valid = false;
        } else if (!isLowerLatinLetter(name.codePointAt(0))) {
            valid = false;
        } else {
            for (int index = 1; index < name.length(); index++) {
                int code = name.codePointAt(index);
                if (!isSpecialSymbol(code) && !isUpperLatinLetter(code)
                        && !isLowerLatinLetter(code) && !Character.isDigit(code)) {
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}

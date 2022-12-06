package racingcar.domain;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

import java.lang.IllegalArgumentException;

public class Validator {
    public static void isValidNameList(final List<String> names) {
        isExist(names.size());
        for (int i = 0; i < names.size(); i++) {
            isValidName(names.get(i));
            isDuplicate(names);
        }
    }

    public static void isValidName(final String name) {
        if (name.length() > 5 || name.length() < 1)
            throw new IllegalArgumentException("자동차의 이름은 5글자 이하여야 한다.");
    }

    public static void isDuplicate(List<String> names) {
        Set<String> nameSet = new HashSet<>(names);

        if (nameSet.size() != names.size())
            throw new IllegalArgumentException("자동차의 이름은 고유해야 한다.");
    }

    public static void isValidRoundNumber(String number) {
        for (int i = 0; i < number.length(); i++)
            isDigit(number.charAt(i));
    }

    public static void isDigit(Character c) {
        if (!Character.isDigit(c))
            throw new IllegalArgumentException("시도 횟수는 숫자여야 한다.");
    }

    public static void isExist(int size) {
        if (size <= 0)
            throw new IllegalArgumentException("이름은 1~5 길이 사이의 영문자여야 한다.");
    }
}

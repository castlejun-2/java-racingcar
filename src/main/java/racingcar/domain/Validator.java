package racingcar.domain;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

import java.lang.IllegalArgumentException;

public class Validator {
    public static void isValidNameList(final List<String> names) {
        for (int i = 0; i < names.size(); i++) {
            isDuplicate(names);
        }
    }

    public static void isDuplicate(List<String> names) {
        Set<String> nameSet = new HashSet<>(names);

        if (nameSet.size() != names.size())
            throw new IllegalArgumentException("자동차의 이름은 고유해야 한다.");
    }
}

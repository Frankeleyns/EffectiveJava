package com.effective.chapter4.artic15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ValueItem {
    //public static final int[] VALUES = {1,2,3};
    private static final Integer[] VALUES = {1,2,3};

    public static final List<Integer> VALUES_LIST =
            Collections.unmodifiableList(Arrays.asList(VALUES));

    public static final Integer[] getValues(){
        return VALUES.clone();
    }
}

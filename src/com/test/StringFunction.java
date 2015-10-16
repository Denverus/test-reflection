package com.test;

import java.util.LinkedList;
import java.util.List;

public class StringFunction {
    public static final String FUNC_STARTS_WITH_NAME = "startsWith(\"\")";
    public static final String FUNC_ENDS_WITH_NAME = "endsWith(\"\")";
    public static final String FUNC_CONTAINS_NAME = "contains(\"\")";
    public static final String FUNC_LENGTH_NAME = "length()";
    public static final String FUNC_STARTS_WITH_DESCRIPTION = "Tests if this string starts with the specified prefix.";
    public static final String FUNC_ENDS_WITH_DESCRIPTION = "Tests if this string ends with the specified suffix.";
    public static final String FUNC_CONTAINS_DESCRIPTION = "Returns true if this string contains the specified String value.";
    public static final String FUNC_LENGTH_DESCRIPTION = "Returns the length of this string. ";

    public static boolean isSupportedFunction(String name) {
        for (PPLFunction f : getSupportedFunctions()) {
            if (f.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static List<PPLFunction> getSupportedFunctions() {
        List<PPLFunction> functions = new LinkedList<PPLFunction>();

        // Boolean
        functions.add(new PPLFunction(StringFunction.FUNC_STARTS_WITH_NAME, StringFunction.FUNC_STARTS_WITH_DESCRIPTION, true));
        functions.add(new PPLFunction(StringFunction.FUNC_ENDS_WITH_NAME, StringFunction.FUNC_ENDS_WITH_DESCRIPTION, true));
        functions.add(new PPLFunction(StringFunction.FUNC_CONTAINS_NAME, StringFunction.FUNC_CONTAINS_DESCRIPTION, true));

        // Not boolean
        functions.add(new PPLFunction(StringFunction.FUNC_LENGTH_NAME, StringFunction.FUNC_LENGTH_DESCRIPTION, false));

        return functions;
    }    
}
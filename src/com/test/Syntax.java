package com.test;

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class Syntax {

    public Syntax() {
    }
    public static Class availableConditions[] = {FileFunction.class,
        StringFunction.class};

    @SuppressWarnings("unchecked")
    public static List<PPLFunction> getFunctions() {
        List<PPLFunction> functions = new LinkedList<PPLFunction>();

        for (Class c : availableConditions) {

            try {
                Method m = c.getMethod("getSupportedFunctions", new Class[]{});

                List<PPLFunction> funcs = (List<PPLFunction>) m.invoke(null, (Object[]) null);
                functions.addAll(funcs);

            } catch (Exception ex) {
            }

        }
        return functions;
    }
}
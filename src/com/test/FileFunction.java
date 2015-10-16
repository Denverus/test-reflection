package com.test;

import java.util.LinkedList;
import java.util.List;

public class FileFunction {
    public static final String FUNC_LENGTH_NAME = "length()";
    public static final String FUNC_EXISTS_NAME = "exists()";
    public static final String FUNC_ISDIR_NAME = "isdir()";
    public static final String FUNC_EXISTS_DESCRIPTION = "This parameter's path exists";
    public static final String FUNC_ISDIR_DESCRIPTION = "This parameter's path is a directory";
    public static final String FUNC_LENGTH_DESCRIPTION = "Returns the length of the file";
    
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
        functions.add(new PPLFunction(FileFunction.FUNC_EXISTS_NAME, FileFunction.FUNC_EXISTS_DESCRIPTION, true));
        functions.add(new PPLFunction(FileFunction.FUNC_ISDIR_NAME, FileFunction.FUNC_ISDIR_DESCRIPTION, true));

        // Not Boolean
        functions.add(new PPLFunction(FileFunction.FUNC_LENGTH_NAME, FileFunction.FUNC_LENGTH_DESCRIPTION, false));

        return functions;
    }    
}

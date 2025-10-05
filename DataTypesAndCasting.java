public class DataTypesAndCasting {
    public static void main(String[] args) {
        
        System.out.println("=== JAVA DATA TYPES ===\n");
        
        // PRIMITIVE DATA TYPES
        
        // byte: 1 byte, range -128 to 127
        byte b = 100;
        System.out.println("byte: " + b + " | Size: 1 byte | Range: -128 to 127");
        
        // short: 2 bytes, range -32,768 to 32,767
        short s = 30000;
        System.out.println("short: " + s + " | Size: 2 bytes | Range: -32,768 to 32,767");
        
        // int: 4 bytes, range -2,147,483,648 to 2,147,483,647
        int i = 100000;
        System.out.println("int: " + i + " | Size: 4 bytes | Range: -2,147,483,648 to 2,147,483,647");
        
        // long: 8 bytes, range -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long l = 9876543210L; // L suffix for long literals
        System.out.println("long: " + l + " | Size: 8 bytes | Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
        
        // float: 4 bytes, range ~1.4e-45 to ~3.4e+38 (7 decimal digits precision)
        float f = 3.14f; // f suffix for float literals
        System.out.println("float: " + f + " | Size: 4 bytes | Range: ~1.4e-45 to ~3.4e+38");
        
        // double: 8 bytes, range ~4.9e-324 to ~1.8e+308 (15 decimal digits precision)
        double d = 3.141592653589793;
        System.out.println("double: " + d + " | Size: 8 bytes | Range: ~4.9e-324 to ~1.8e+308");
        
        // char: 2 bytes, range 0 to 65,535 (Unicode characters)
        char c = 'A';
        System.out.println("char: " + c + " | Size: 2 bytes | Range: 0 to 65,535 (Unicode)");
        
        // boolean: size not precisely defined, holds true or false
        boolean bool = true;
        System.out.println("boolean: " + bool + " | Size: Not precisely defined | Values: true or false");
        
        
        System.out.println("\n=== TYPE CASTING ===\n");
        
        // WIDENING CASTING (Automatic/Implicit) - smaller to larger type
        System.out.println("--- WIDENING CASTING (Automatic) ---");
        
        // byte to short
        byte byteVal = 50;
        short shortVal = byteVal;
        System.out.println("byte to short: " + byteVal + " -> " + shortVal);
        
        // short to int
        short shortVal2 = 1000;
        int intVal = shortVal2;
        System.out.println("short to int: " + shortVal2 + " -> " + intVal);
        
        // int to long
        int intVal2 = 50000;
        long longVal = intVal2;
        System.out.println("int to long: " + intVal2 + " -> " + longVal);
        
        // long to float
        long longVal2 = 123456789L;
        float floatVal = longVal2;
        System.out.println("long to float: " + longVal2 + " -> " + floatVal);
        
        // float to double
        float floatVal2 = 3.14f;
        double doubleVal = floatVal2;
        System.out.println("float to double: " + floatVal2 + " -> " + doubleVal);
        
        // char to int
        char charVal = 'Z';
        int intFromChar = charVal;
        System.out.println("char to int: " + charVal + " -> " + intFromChar + " (Unicode value)");
        
        
        System.out.println("\n--- NARROWING CASTING (Manual/Explicit) ---\n");
        
        // double to float
        double doubleVal2 = 9.78;
        float floatVal3 = (float) doubleVal2; // explicit cast required
        System.out.println("double to float: " + doubleVal2 + " -> " + floatVal3);
        
        // float to long
        float floatVal4 = 45.67f;
        long longVal3 = (long) floatVal4; // decimal part is truncated
        System.out.println("float to long: " + floatVal4 + " -> " + longVal3);
        
        // long to int
        long longVal4 = 100000L;
        int intVal3 = (int) longVal4;
        System.out.println("long to int: " + longVal4 + " -> " + intVal3);
        
        // int to short
        int intVal4 = 5000;
        short shortVal3 = (short) intVal4;
        System.out.println("int to short: " + intVal4 + " -> " + shortVal3);
        
        // short to byte
        short shortVal4 = 100;
        byte byteVal2 = (byte) shortVal4;
        System.out.println("short to byte: " + shortVal4 + " -> " + byteVal2);
        
        // int to char
        int intVal5 = 65;
        char charVal2 = (char) intVal5;
        System.out.println("int to char: " + intVal5 + " -> " + charVal2);
        
        // double to int (data loss example)
        double doubleVal3 = 123.456;
        int intVal6 = (int) doubleVal3; // loses decimal part
        System.out.println("double to int (data loss): " + doubleVal3 + " -> " + intVal6);
        
        
        System.out.println("\n--- OVERFLOW EXAMPLE ---");
        
        // int overflow when casting from larger type
        int largeInt = 130;
        byte overflowByte = (byte) largeInt; // byte max is 127, so overflow occurs
        System.out.println("int to byte overflow: " + largeInt + " -> " + overflowByte);
        // Explanation: (130 % 256) - 256 = -126 (wraps around)
        
        
        System.out.println("\n--- STRING CONVERSIONS ---");
        
        // primitive to String
        int num = 42;
        String str1 = String.valueOf(num);
        System.out.println("int to String: " + num + " -> \"" + str1 + "\"");
        
        // String to primitive (using wrapper classes)
        String str2 = "123";
        int parsedInt = Integer.parseInt(str2);
        System.out.println("String to int: \"" + str2 + "\" -> " + parsedInt);
        
        String str3 = "45.67";
        double parsedDouble = Double.parseDouble(str3);
        System.out.println("String to double: \"" + str3 + "\" -> " + parsedDouble);
        
        
        System.out.println("\n=== END OF TUTORIAL ===");
    }
}
public class OperatorsTutorial {
    public static void main(String[] args) {
        
        System.out.println("=== JAVA OPERATORS ===\n");
        
        // ARITHMETIC OPERATORS
        System.out.println("--- ARITHMETIC OPERATORS ---");
        
        int a = 20;
        int b = 10;
        
        // Addition
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        
        // Subtraction
        int difference = a - b;
        System.out.println(a + " - " + b + " = " + difference);
        
        // Multiplication
        int product = a * b;
        System.out.println(a + " * " + b + " = " + product);
        
        // Division
        int quotient = a / b;
        System.out.println(a + " / " + b + " = " + quotient);
        
        // Modulus (remainder)
        int remainder = a % b;
        System.out.println(a + " % " + b + " = " + remainder);
        
        // Division with decimals
        double decimalDiv = 20.0 / 3.0;
        System.out.println("20.0 / 3.0 = " + decimalDiv);
        
        // Integer division truncates
        int intDiv = 20 / 3;
        System.out.println("20 / 3 (integer division) = " + intDiv);
        
        
        System.out.println("\n--- UNARY OPERATORS ---");
        
        int x = 10;
        
        // Unary plus (indicates positive value)
        int positive = +x;
        System.out.println("+x = " + positive);
        
        // Unary minus (negates value)
        int negative = -x;
        System.out.println("-x = " + negative);
        
        // Pre-increment (increments then returns)
        int preInc = ++x;
        System.out.println("++x: x is now " + x + ", returned " + preInc);
        
        x = 10; // reset
        
        // Post-increment (returns then increments)
        int postInc = x++;
        System.out.println("x++: returned " + postInc + ", x is now " + x);
        
        x = 10; // reset
        
        // Pre-decrement
        int preDec = --x;
        System.out.println("--x: x is now " + x + ", returned " + preDec);
        
        x = 10; // reset
        
        // Post-decrement
        int postDec = x--;
        System.out.println("x--: returned " + postDec + ", x is now " + x);
        
        
        System.out.println("\n--- RELATIONAL OPERATORS ---");
        
        int num1 = 15;
        int num2 = 20;
        
        // Equal to
        boolean isEqual = (num1 == num2);
        System.out.println(num1 + " == " + num2 + " : " + isEqual);
        
        // Not equal to
        boolean notEqual = (num1 != num2);
        System.out.println(num1 + " != " + num2 + " : " + notEqual);
        
        // Greater than
        boolean greater = (num1 > num2);
        System.out.println(num1 + " > " + num2 + " : " + greater);
        
        // Less than
        boolean less = (num1 < num2);
        System.out.println(num1 + " < " + num2 + " : " + less);
        
        // Greater than or equal to
        boolean greaterOrEqual = (num1 >= num2);
        System.out.println(num1 + " >= " + num2 + " : " + greaterOrEqual);
        
        // Less than or equal to
        boolean lessOrEqual = (num1 <= num2);
        System.out.println(num1 + " <= " + num2 + " : " + lessOrEqual);
        
        
        System.out.println("\n--- LOGICAL OPERATORS ---");
        
        boolean p = true;
        boolean q = false;
        
        // Logical AND (both must be true)
        boolean andResult = p && q;
        System.out.println(p + " && " + q + " = " + andResult);
        
        // Logical OR (at least one must be true)
        boolean orResult = p || q;
        System.out.println(p + " || " + q + " = " + orResult);
        
        // Logical NOT (inverts boolean value)
        boolean notResult = !p;
        System.out.println("!" + p + " = " + notResult);
        
        // Short-circuit example
        int val = 5;
        boolean shortCircuit = (val > 10) && (++val > 5); // ++val not executed
        System.out.println("Short-circuit: val is still " + val);
        System.out.println("Result of (val > 10) && (++val > 5): " + shortCircuit);
        
        
        System.out.println("\n--- ASSIGNMENT OPERATORS ---");
        
        int n = 10;
        System.out.println("Initial n = " + n);
        
        // Add and assign
        n += 5; // n = n + 5
        System.out.println("n += 5 : " + n);
        
        // Subtract and assign
        n -= 3; // n = n - 3
        System.out.println("n -= 3 : " + n);
        
        // Multiply and assign
        n *= 2; // n = n * 2
        System.out.println("n *= 2 : " + n);
        
        // Divide and assign
        n /= 4; // n = n / 4
        System.out.println("n /= 4 : " + n);
        
        // Modulus and assign
        n %= 5; // n = n % 5
        System.out.println("n %= 5 : " + n);
        
        
        System.out.println("\n--- BITWISE OPERATORS ---");
        
        int m = 5;  // Binary: 0101
        int o = 3;  // Binary: 0011
        
        // Bitwise AND
        int bitwiseAnd = m & o; // 0101 & 0011 = 0001 (1)
        System.out.println(m + " & " + o + " = " + bitwiseAnd);
        
        // Bitwise OR
        int bitwiseOr = m | o; // 0101 | 0011 = 0111 (7)
        System.out.println(m + " | " + o + " = " + bitwiseOr);
        
        // Bitwise XOR
        int bitwiseXor = m ^ o; // 0101 ^ 0011 = 0110 (6)
        System.out.println(m + " ^ " + o + " = " + bitwiseXor);
        
        // Bitwise NOT (complement)
        int bitwiseNot = ~m; // inverts all bits
        System.out.println("~" + m + " = " + bitwiseNot);
        
        // Left shift
        int leftShift = m << 1; // 0101 << 1 = 1010 (10)
        System.out.println(m + " << 1 = " + leftShift);
        
        // Right shift
        int rightShift = m >> 1; // 0101 >> 1 = 0010 (2)
        System.out.println(m + " >> 1 = " + rightShift);
        
        // Unsigned right shift
        int unsignedShift = -5 >>> 1; // fills with 0s
        System.out.println("-5 >>> 1 = " + unsignedShift);
        
        
        System.out.println("\n--- TERNARY OPERATOR ---");
        
        int age = 18;
        // condition ? valueIfTrue : valueIfFalse
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age " + age + " is: " + status);

        int val1 = 15;
        int val2 = 10;
        int max = (val1 > val2) ? val1 : val2;
        System.out.println("Maximum of 15 and 10: " + max);
        
        
        System.out.println("\n--- INSTANCEOF OPERATOR ---");
        
        String text = "Hello";
        boolean isString = text instanceof String;
        System.out.println("\"Hello\" instanceof String: " + isString);
        
        
        System.out.println("\n--- OPERATOR PRECEDENCE EXAMPLE ---");
        
        int result = 10 + 5 * 2; // multiplication before addition
        System.out.println("10 + 5 * 2 = " + result);
        
        int result2 = (10 + 5) * 2; // parentheses override precedence
        System.out.println("(10 + 5) * 2 = " + result2);
        
        
        System.out.println("\n=== END OF TUTORIAL ===");
    }
}
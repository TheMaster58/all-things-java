public class ControlFlowTutorial {
    public static void main(String[] args) {
        System.out.println("=== JAVA CONTROL FLOW STATEMENTS ===\n");
        
        // IF-ELSE STATEMENTS
        System.out.println("--- IF-ELSE STATEMENTS ---");
        
        int age = 18;
        
        // Simple if-else
        if (age >= 18) {
            System.out.println("Person is an adult");
        } else {
            System.out.println("Person is a minor");
        }
        
        // Multiple conditions with else-if
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        
        // Nested if statements
        boolean hasLicense = true;
        if (age >= 18) {
            if (hasLicense) {
                System.out.println("Can drive independently");
            } else {
                System.out.println("Need to get a license first");
            }
        } else {
            System.out.println("Too young to drive");
        }
        
        // Edge case: empty blocks
        if (true) {
            // Empty block is valid but not recommended
        }
        
        
        System.out.println("\n--- SWITCH STATEMENTS ---");
        
        // Basic switch with char
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Fair");
                break;
            default:
                System.out.println("Invalid grade");
        }
        
        // Switch with fall-through (intentionally omitting break)
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
        
        // Switch with String (Java 7+)
        String command = "start";
        switch (command.toLowerCase()) {
            case "start":
                System.out.println("Starting the program");
                break;
            case "stop":
                System.out.println("Stopping the program");
                break;
            case "restart":
                System.out.println("Restarting the program");
                break;
            default:
                System.out.println("Unknown command");
        }
        
        
        System.out.println("\n--- FOR LOOPS ---");
        
        // Basic for loop
        System.out.println("Basic for loop:");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // For loop with multiple variables
        System.out.println("For loop with multiple variables:");
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
        
        // Enhanced for loop (for-each)
        System.out.println("Enhanced for loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Nested for loops
        System.out.println("Multiplication table (nested loops):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        
        
        System.out.println("\n--- WHILE LOOPS ---");
        
        // Basic while loop
        int count = 0;
        while (count < 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        
        // Do-while loop (executes at least once)
        int num = 10;
        do {
            System.out.println("This executes once even if condition is false");
        } while (num < 0);
        
        // While loop with break
        System.out.println("While loop with break:");
        int i = 0;
        while (true) {
            if (i >= 5) {
                break;
            }
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        
        
        System.out.println("\n--- CONTINUE AND BREAK STATEMENTS ---");
        
        // Continue statement
        System.out.println("Skipping odd numbers using continue:");
        for (int n = 0; n < 10; n++) {
            if (n % 2 != 0) {
                continue; // Skip odd numbers
            }
            System.out.print(n + " ");
        }
        System.out.println();
        
        // Break statement
        System.out.println("Breaking loop when number is 5:");
        for (int n = 0; n < 10; n++) {
            if (n == 5) {
                break; // Exit loop when n equals 5
            }
            System.out.print(n + " ");
        }
        System.out.println();
        
        
        System.out.println("\n--- EDGE CASES AND SPECIAL SCENARIOS ---");
        
        // Infinite loop with condition to break
        System.out.println("Controlled infinite loop:");
        int counter = 0;
        while (true) {
            System.out.print(counter + " ");
            counter++;
            if (counter >= 5) break;
        }
        System.out.println();
        
        // Empty loops
        for (int x = 0; x < 5; x++); // Empty loop (note the semicolon)
        
        // Loop with complex condition
        System.out.println("Loop with multiple conditions:");
        for (int x = 0; x < 5 && x >= 0 && x != 3; x++) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        // Labeled break and continue
        System.out.println("Labeled break example:");
        outerLoop:
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (x == 1 && y == 1) {
                    break outerLoop; // Breaks both loops
                }
                System.out.print("(" + x + "," + y + ") ");
            }
        }
        System.out.println();
        
        System.out.println("\n=== END OF TUTORIAL ===");
    }
}
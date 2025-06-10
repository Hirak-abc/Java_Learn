public class NestedLoops {

    public static void main(String[] args) {

        // Outer loop (for loop) - controls the rows
        for (int i = 1; i <= 5; i++) {
            System.out.println("Outer loop i = " + i);

            // Inner loop (while loop) - controls the columns
            int j = 1;
            while (j <= 5) {
                
                // Use continue: skip printing when j == 3
                if (j == 3) {
                    j++; // Must increment before continue to avoid infinite loop
                    continue; // Skip this iteration of inner loop
                }

                // Use break: stop inner loop when j == 5
                if (j == 5) {
                    break; // Exit inner loop completely
                }

                System.out.println("   Inner loop j = " + j);
                j++; // Increment the inner loop counter
            }

            System.out.println("--------");
        }
    }
}


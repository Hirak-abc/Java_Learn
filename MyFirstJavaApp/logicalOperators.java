public class logicalOperators {

    public static void main(String[] args) {

        // Example values
        int age = 25;
        boolean hasLicense = true;
        boolean hasInsurance = false;

        // Using logical AND (&&)
        if (age >= 18 && hasLicense) {
            System.out.println("Eligible to drive.");
        } else {
            System.out.println("Not eligible to drive.");
        }

        // Using logical OR (||)
        if (hasLicense || hasInsurance) {
            System.out.println("Has at least one requirement for driving.");
        } else {
            System.out.println("Has neither a license nor insurance.");
        }

        // Using logical NOT (!)
        if (!hasInsurance) {
            System.out.println("Warning: Driving without insurance!");
        }

        // Combining all logical operators
        if ((age >= 18 && hasLicense) || hasInsurance) {
            System.out.println("Conditionally allowed to drive.");
        } else {
            System.out.println("Not allowed to drive.");
        }
    }
}

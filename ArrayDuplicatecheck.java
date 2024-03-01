public class ArrayDuplicateCheck {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the array
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; // Example array

        // Step 2: Call the function to check for duplicates
        boolean hasDuplicates = containsDuplicate(arr);

        // Step 3: Output the result
        if (hasDuplicates) {
            System.out.println("Array contains duplicate elements.");
        } else {
            System.out.println("Array does not contain duplicate elements.");
        }
    }

    // Function to check for duplicate elements in the array
    public static boolean containsDuplicate(int[] arr) {
        // Step 1: Create a HashSet to store unique elements
        Set<Integer> set = new HashSet<>();

        // Step 2: Iterate through the array
        for (int num : arr) {
            // Step 3: Check if the element is already in the set
            if (set.contains(num)) {
                // If it's already in the set, it's a duplicate
                return true;
            } else {
                // Otherwise, add it to the set
                set.add(num);
            }
        }
        // Step 4: If no duplicates are found, return false
        return false;
    }
}

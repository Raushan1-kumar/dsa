
// in this question we have given a s1 and s2 and we need to find how many insertion and deletion required to convert s2 similar to s1 


public class minimumInsertionAndDeletion {

    public static int minInsertions(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Find length of longest common subsequence
        int lcsLength = shortedCommonSuperSequence.shortedCommonSuperSequenceMethod(s1, s2, m, n);

        // Minimum insertions = (length of s1 - lcsLength)
        // Minimum deletions = (length of s2 - lcsLength)
        return (m - lcsLength) + (n - lcsLength);
    }

    public static void main(String[] args) {
        String s1 = "heap";
        String s2 = "peas";

        System.out.println("Minimum insertions and deletions required: " + minInsertions(s1, s2));
    }
}

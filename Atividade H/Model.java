public class VowelCounter {
    public static int countVowels(String input) {
        int count = 0;
        input = input.toLowerCase();
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}

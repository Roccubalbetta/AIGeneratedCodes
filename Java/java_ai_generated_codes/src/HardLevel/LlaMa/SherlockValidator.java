package HardLevel.LlaMa;

public class SherlockValidator {
    public static String isValid(String str) {
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        int count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                count++;
                max = Math.max(max, freq[i]);
                min = Math.min(min, freq[i]);
            }
        }
        if (max == min) {
            return "YES";
        } else if (max - min == 1 && count > 1) {
            int maxCount = 0;
            int minCount = 0;
            for (int i = 0; i < 26; i++) {
                if (freq[i] == max) {
                    maxCount++;
                } else if (freq[i] == min) {
                    minCount++;
                }
            }
            if (maxCount == 1 || minCount == 1) {
                return "YES";
            }
        }
        return "NO";
    }
}

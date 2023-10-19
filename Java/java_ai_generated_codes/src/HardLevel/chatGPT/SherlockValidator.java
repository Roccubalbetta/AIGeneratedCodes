package HardLevel.chatGPT;

import java.util.HashMap;
import java.util.Map;

public class SherlockValidator {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abcc";
        String str3 = "abccc";

        System.out.println(isValidString(str1)); // Output: "YES"
        System.out.println(isValidString(str2)); // Output: "YES"
        System.out.println(isValidString(str3)); // Output: "NO"
    }

    public static String isValidString(String str) {
        int[] frequency = new int[26]; // Assuming only lowercase English letters

        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            frequency[c - 'a']++;
        }

        int maxFrequency = 0;
        int minFrequency = Integer.MAX_VALUE;
        int maxCount = 0;
        int minCount = 0;

        for (int freq : frequency) {
            if (freq > 0) {
                if (freq == maxFrequency) {
                    maxCount++;
                } else if (freq > maxFrequency) {
                    maxFrequency = freq;
                    maxCount = 1;
                }

                if (freq == minFrequency) {
                    minCount++;
                } else if (freq < minFrequency) {
                    minFrequency = freq;
                    minCount = 1;
                }
            }
        }

        // Check if the string can become valid by removing characters
        if ((maxFrequency - minFrequency == 0) || (maxCount == 1 && maxFrequency - minFrequency == 1 && maxFrequency > 1) || (minCount == 1 && minFrequency == 1 && maxFrequency == minFrequency + 1)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}


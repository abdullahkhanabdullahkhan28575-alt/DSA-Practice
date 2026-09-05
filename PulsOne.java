/**
 * PulsOne
 */
public class PulsOne {

    public int[] plusOne(int[] digits) {
        if (digits.length == 0)
            return new int[]{1};

        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] += 1;
            return digits;
        } else {
            int[] newDigits = new int[digits.length - 1];
            System.arraycopy(digits, 0, newDigits, 0, digits.length - 1);
            int[] result = plusOne(newDigits);
            result = java.util.Arrays.copyOf(result, result.length + 1);
            result[result.length - 1] = 0;
            return result;
        }
    }
}
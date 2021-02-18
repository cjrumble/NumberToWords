public class NumberToWords {

    public static void numberToWords(int number) {
        String word = "";
        // check constraints
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        }
        int numberCount = getDigitCount(number);
        int revNumber = reverse(number);
        int revNumberCount = getDigitCount(revNumber);

        while (0 != revNumber) {
            int digit = revNumber % 10;
            if (digit == 0) word += "Zero ";
            if (digit == 1) word += "One ";
            if (digit == 2) word += "Two ";
            if (digit == 3) word += "Three ";
            if (digit == 4) word += "Four ";
            if (digit == 5) word += "Five ";
            if (digit == 6) word += "Six ";
            if (digit == 7) word += "Seven ";
            if (digit == 8) word += "Eight ";
            if (digit == 9) word += "Nine ";
            revNumber /= 10;
            }
        for (int i=0; i<(numberCount-revNumberCount); i++) {
            word += "Zero ";
        }
        System.out.println(word);
    }

    public static int getDigitCount(int num) {
        if (num < 0) {
            return -1;
        }
        int count = 0;
        if (num == 0) count++;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int reverse(int num) {
            int reverse = 0;
            while (0 != num) {
                int lastDigit = num % 10;
                reverse = (reverse * 10) + lastDigit;
                num /= 10;
            }
            return reverse;
    }

}

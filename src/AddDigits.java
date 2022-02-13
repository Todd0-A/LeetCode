public class AddDigits {
    /*
    Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
    https://leetcode.com/problems/add-digits/
     */
    public int addDigits(int num) {
        if (num<10)
            return num;
        return addDigits(num%10+addDigits(num/10));
    }
}

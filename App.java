public class App {
    public static String oddsVsEvens(int num) {
        // write your code here
        String str = Integer.toString(num);
        char[] chars = str.toCharArray();
        int lngth = chars.length;
        int curr = 0;
        int odd = 0;
        int even = 0;
        for (int i = 0; i < lngth; i++) {
            curr = Character.getNumericValue(chars[i]);
            if (curr % 2 == 0 && curr != 0)
                even = even + curr;
            else if (curr % 2 != 0)
                odd = odd + curr;

        }
        if (odd > even)
            return "odd";
        else if (odd < even)
            return "even";
        else
            return "equal";

    }

    public static void main(String[] args) throws Exception {
        int x = 97428;
        System.out.println(oddsVsEvens(x));
    }
}

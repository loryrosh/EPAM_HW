package EPAM.hw_lesson170620;

public class CodingBat {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        //System.out.println( array123( arr ) );

        int[] nums = {6, 6, 2, 6};
        //System.out.println(array667(nums));

        //System.out.println(makeBricks(3, 2, 9));
        //System.out.println(round10(12) + round10(12) + round10(14));

        //System.out.println(Arrays.toString(reverse3(new int[]{1, 2, 3})));

        //System.out.println(getSandwich("xxbreadyy"));
        //System.out.println(plusOut("abXYabcXYZ", "abc"));
        //System.out.println(wordEnds("abcXY123XYijk", "XY"));
        //System.out.println(countYZ("zxyx"));
        //System.out.println(withoutString("Hello there", "llo"));
        System.out.println(countTriple("abcXXXabc"));
    }

    public static boolean array123(int[] nums) {
        if (nums.length < 3)
            return false;

        int curIndex = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == curIndex)
                curIndex++;
            else {
                curIndex = 1;

                if (nums[i] == 1)
                    i--;
            }
            if (curIndex == 4)
                return true;
        }
        return false;
    }

    public static int array667(int[] nums) {
        if (nums.length < 2)
            return 0;

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((i + 1) < nums.length && nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7))
                count++;
        }
        return count;
    }

    public static boolean makeBricks(int small, int big, int goal) {
        int numBig = goal / 5;
        if (numBig <= big) {
            return (goal - (numBig * 5) <= small);
        } else {
            return (goal - (big * 5) <= small);
        }
    }

    public static int round10(int num) {
        int right = num % 10;
        if (right < 5) {
            int res = num - right;
            return res >= 0 ? res : 0;
        }
        return num + (10 - right);
    }

    public static int[] reverse3(int[] nums) {
        int[] res = new int[nums.length];
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[count++] = nums[i];
        }
        return res;
    }

    public static String getSandwich(String str) {
        String bread = "bread";
        int ind = str.indexOf(bread);
        if (ind == -1)
            return "";

        int startInd = ind;
        int endInt = -1;
        while (ind >= 0) {
            ind = str.indexOf(bread, ind + 1);

            if (ind != -1)
                endInt = ind;
        }

        if (endInt == -1)
            return "";

        return str.substring(startInd + bread.length(), endInt);
    }

    public static String plusOut(String str, String word) {
        StringBuilder res = new StringBuilder();

        int count = 0;
        while (count < str.length()) {
            boolean match = true;
            if (str.charAt(count) == word.charAt(0)) {
                for (int i = 0; i < word.length(); i++) {
                    if (str.charAt(count + i) != word.charAt(i)) {
                        match = false;
                        break;
                    }
                }
            } else
                match = false;

            if (match) {
                res.append(word);
                count += word.length();
            } else {
                res.append("+");
                count++;
            }
        }
        return res.toString();
    }

    public static String wordEnds(String str, String word) {
        if (str.length() < word.length() || str.equals(word))
            return "";

        StringBuilder res = new StringBuilder();
        int ind = str.indexOf(word);
        while (ind >= 0) {
            if (ind > 0)
                res.append(str.charAt(ind - 1));
            if (ind < str.length() - word.length())
                res.append(str.charAt(ind + word.length()));

            ind = str.indexOf(word, ind + 1);
        }
        return res.toString();
    }

    private static int countYZ(String str) {
        String[] res = str.split("[y|Y|z|Z]\\b");

        int reslen = 0;
        int count = 0;
        for (String s : res) {
            if (s.matches(".*[y|z]\\d.*")) {
                count++;
            }
            reslen += s.length();
        }
        return str.length() - reslen + count;
    }

    public static String withoutString(String base, String remove) {
        return base.replaceAll(("(?i)" + remove), "");
    }

    public static int countTriple(String str) {
        if (str.length() < 3)
            return 0;

        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            char curLetter = str.charAt(i);
            boolean match = true;

            for (int j = i + 1; j < i + 3; j++) {
                if (str.charAt(j) != curLetter) {
                    match = false;
                    break;
                }
            }
            if (match)
                count++;
        }
        return count;
    }
}

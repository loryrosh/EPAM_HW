package EPAM.hw_lesson170620;

import java.util.Arrays;

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
        //System.out.println(withoutString("Hello the   re", "llo"));
        //System.out.println(countTriple("abcXXXabc"));
        //System.out.println(sameEnds("Hello! and Hello!"));
        //System.out.println(mirrorEnds("xxYxx"));
        //System.out.println(maxBlock("xyz"));
        //System.out.println(sumNumbers("aa11b33"));
        //System.out.println(notReplace("is-is"));
        //System.out.println(post4(new int[]{4, 4, 1, 2, 3}));
        //System.out.println(zeroFront(new int[]{0, 0, 1, 1}));
        //System.out.println(Arrays.toString(withoutTen(new int[]{1, 10, 10, 2})));
        //System.out.println(zeroMax(new int[]{0, 5, 0, 3}));
        //System.out.println(Arrays.toString(fix34(new int[]{1, 3, 1, 4, 4, 3, 1})));
        //System.out.println(Arrays.toString(seriesUp(3)));
        //System.out.println(maxMirror(new int[]{1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25}));
        //System.out.println(maxMirror(new int[]{5, 9, 1, 6, 5, 4, 1, 9, 5}));
        System.out.println(dividesSelf(120));

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

    public static String sameEnds(String str) {
        if (str.length() < 2)
            return "";

        int left = 0;
        int right = 0;
        if (str.length() % 2 == 0) {
            right = str.length() / 2;
        } else {
            right = str.length() / 2 + 1;
        }

        StringBuilder res = new StringBuilder();
        while (right < str.length() && str.charAt(left) != str.charAt(right)) {
            right++;
        }

        while (right < str.length() && str.charAt(left) == str.charAt(right)) {
            res.append(str.charAt(left++));
            right++;
        }

        return res.toString();
    }

    public static String mirrorEnds(String str) {
        StringBuilder res = new StringBuilder();

        int left = 0;
        int right = str.length() - 1;

        while (left < str.length() && right >= 0 &&
                str.charAt(left) == str.charAt(right)) {
            res.append(str.charAt(left++));
            right--;
        }

        return res.toString();
    }

    public static int maxBlock(String str) {
        if (str.length() == 0)
            return 0;

        char curChar = str.charAt(0);
        int maxCount = 1;

        for (int i = 1; i < str.length(); i++) {
            if (curChar == str.charAt(i)) {
                int count = 1;
                while (i < str.length() && curChar == str.charAt(i)) {
                    count++;
                    i++;
                }
                if (maxCount < count)
                    maxCount = count;
            }
            if (i < str.length()) {
                curChar = str.charAt(i);
            }
        }
        return maxCount;
    }

    public static int sumNumbers(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            String num = "";
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                num += str.charAt(i++) + "";
            }

            if (!"".equals(num)) {
                sum += Integer.parseInt(num);
            }
        }
        return sum;
    }

    public static String notReplace(String str) {
        String res = str.replaceAll("([^a-zA-Z]|^)(is)([^a-zA-Z]|$)", "$1$2 not$3");

        String r = res.replaceAll("(is not[^a-zA-Z])(is)([^a-zA-Z]|$)", "$1$2 not$3");
        return r;
    }

    public static int[] post4(int[] nums) {
        if (nums.length == 1)
            return new int[]{};

        int idx = nums.length - 1;
        for (int i = idx; i >= 0; i--) {
            if (nums[i] == 4)
                break;
            idx--;
        }

        int[] arr = new int[nums.length - idx - 1];
        int count = 0;
        for (int i = idx + 1; i < nums.length; i++) {
            arr[count++] = nums[i];
        }
        return arr;
    }

    public static int[] zeroFront(int[] nums) {
        Arrays.sort(nums);

        if (nums[0] >= 0)
            return nums;

        int idx = 0;
        while (nums[idx] == 0) {
            idx++;
        }

        int[] res = new int[nums.length];
        int count = 0;
        for (int i = idx; i < nums.length; i++) {
            res[count++] = nums[i];
        }

        for (int i = 0; i < idx; i++) {
            res[count++] = nums[i];
        }
        return res;
    }

    public static int[] withoutTen(int[] nums) {
        if (nums.length == 0)
            return nums;

        int[] res = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                res[count++] = nums[i];
            }
        }
        return res;
    }

    public static int[] zeroMax(int[] nums) {
        if (nums.length == 0)
            return nums;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int idx = i + 1;
                int max = 0;
                while (idx < nums.length) {
                    if (nums[idx] % 2 != 0 && max < nums[idx]) {
                        max = nums[idx];
                    }
                    idx++;
                }
                nums[i] = max;
            }
        }
        return nums;
    }

    public static int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 3) {
                int temp = nums[i + 1];
                nums[i + 1] = 4;
                for (int j = i + 2; j < nums.length; j++)
                    if (nums[j] == 4) nums[j] = temp;
            }
        return nums;
    }

    public static int[] seriesUp(int n) {
        int[] res = new int[n * (n + 1) / 2];

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < i + 2; j++) {
                res[count++] = j;
            }
        }
        return res;
    }

    public static int maxMirror(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < i + nums.length; j++) {
                int idx = j;
                for (int k = 0; k < nums.length; k++) {
                    while (k < nums.length && idx < nums.length && nums[idx] == nums[nums.length - 1 - k]) {
                        count++;
                        idx++;
                        k++;
                    }
                    if (maxCount < count) {
                        maxCount = count;
                    }
                    count = 0;
                    idx = j;
                }

                if (maxCount == nums.length) {
                    return maxCount;
                }
            }
        }
        return maxCount;
    }

    public static boolean dividesSelf(int n) {
        if (n == 0)
            return false;

        int cur = n;
        while (cur / 10 != 0) {
            int res = cur % 10;

            if (res == 0 || n % res != 0)
                return false;

            cur = cur / 10;
        }

        if (cur != 1 && n % cur != 0)
            return false;
        return true;
    }
}

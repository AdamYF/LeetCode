class Solution {
    public String countAndSay(int n) {
        return (n > 1) ? countSequence(countAndSay(n - 1)) : "1";
    }

    private static String countSequence(String s) {
        StringBuffer sb = new StringBuffer();

        char arr[] = s.toCharArray();
        int len = s.length();

        int i = 0;
        while (i < len) {
            if (leftEqualsRight(i, arr)) {
                if (leftEqualsRight(i + 1, arr)) {
                    sb.append(3);
                    sb.append(arr[i]);
                    i += 3;
                } else {
                    sb.append(2);
                    sb.append(arr[i]);
                    i += 2;
                }
            } else {
                sb.append(1);
                sb.append(arr[i]);
                i += 1;
            }
        }

        return sb.toString();
    }

    private static boolean leftEqualsRight(int i, char arr[]) {
        if (i == arr.length - 1) {
            return false;
        } else {
            return arr[i] == arr[i + 1];
        }
    }
}
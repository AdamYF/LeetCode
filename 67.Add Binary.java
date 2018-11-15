class Solution {
    public String addBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        char arr1[] = a.toCharArray();
        char arr2[] = b.toCharArray();
        StringBuffer sb = new StringBuffer();

        int i, pos;
        int carry = 0; // 进位
        if (len1 >= len2) {
            int temp[] = new int[len1];
            for (i = 0; i < len1; i++) {
                if (i >= len2) {
                    pos = Integer.parseInt("" + arr1[len1 - i - 1]) + carry;
                    if (pos == 1) {
                        carry = 0;
                        temp[len1 - i - 1] = 1;
                    } else if (pos == 2) {
                        carry = 1;
                        temp[len1 - i - 1] = 0;
                    }
                } else {
                    pos = Integer.parseInt("" + arr1[len1 - i - 1]) + Integer.parseInt("" + arr2[len2 - i - 1]) + carry;
                    if (pos == 1) {
                        carry = 0;
                        temp[len1 - i - 1] = 1;
                    } else if (pos == 2) {
                        carry = 1;
                        temp[len1 - i - 1] = 0;
                    } else if (pos == 3) {
                        carry = 1;
                        temp[len1 - i - 1] = 1;
                    }
                }
            }

            if (carry == 1) {
                sb.append(1);
            }

            for (i = 0; i < len1; i++) {
                sb.append(temp[i]);
            }
        } else {
            int temp[] = new int[len2];
            for (i = 0; i < len2; i++) {
                if (i >= len1) {
                    pos = Integer.parseInt("" + arr2[len2 - i - 1]) + carry;
                    if (pos == 1) {
                        carry = 0;
                        temp[len2 - i - 1] = 1;
                    } else if (pos == 2) {
                        carry = 1;
                        temp[len2 - i - 1] = 0;
                    }
                } else {
                    pos = Integer.parseInt("" + arr2[len2 - i - 1]) + Integer.parseInt("" + arr1[len1 - i - 1]) + carry;
                    if (pos == 1) {
                        carry = 0;
                        temp[len2 - i - 1] = 1;
                    } else if (pos == 2) {
                        carry = 1;
                        temp[len2 - i - 1] = 0;
                    } else if (pos == 3) {
                        carry = 1;
                        temp[len2 - i - 1] = 1;
                    }
                }
            }

            if (carry == 1) {
                sb.append(1);
            }

            for (i = 0; i < len2; i++) {
                sb.append(temp[i]);
            }
        }

        return sb.toString();
    }
}
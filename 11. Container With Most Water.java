// class Solution {
//     public int maxArea(int[] height) {
//         // 求height数组里的最大值maxH
//         int maxH = 0;
//         int len = height.length;
//         for (int h : height) {
//             maxH = max(maxH, h);
//         }

//         // 求最大面积maxA
//         int i, j = len - 2;
//         int req, maxA = min(height[0], height[len - 1]) * (len - 1);
//         while (j > 0) {
//             req = Math.ceil(maxA * 1.0 / j);
//             if (req > maxH) {
//                 continue;
//             } else {
//                 for (i = 0; i < len - j; i++) {
//                     if (req > min(height[i], height[i + j])) {
//                         continue;
//                     } else {
//                         maxA = min(height[i], height[i + j]) * j;
//                         req = Math.ceil(maxA * 1.0 / j);
//                         break;
//                     }
//                 }
//             }
//             j -= 1;
//         }

//         return maxA;
//     }

//     private static int max(int a, int b) {
//         return a >= b ? a : b;
//     }

//     private static int min(int a, int b) {
//         return a <= b ? a : b;
//     }
// }

class Solution {
    public int maxArea(int[] height) {
        int i, j, maxA = 0;

        for (i = 0; i < height.length; i++) {
            for (j = height.length - 1; j > i; j--) {
                maxA = max(maxA, min(height[i], height[j]) * (j - i));
            }
        }

        return maxA;
    }

    private static int max(int a, int b) {
        return a >= b ? a : b;
    }

    private static int min(int a, int b) {
        return a <= b ? a : b;
    }
}
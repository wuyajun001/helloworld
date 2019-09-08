package testsort;

import java.util.Arrays;

/**
 * description:<快速排序>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/7/5 10:23
 */
public class QuickSortTest {


    public static void main(String[] args) {

        int[] nums = {0, 12, 17, 13, 5, 8, 6, 15, 3, 22, 36, 49, 1, 50};
        System.out.println("排序前: " + Arrays.toString(nums));
        quickSort(nums, 0, nums.length - 1);
        System.out.println("\n排序后: " + Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int start, int end) {

        // 如果没有或只有一个元素, 不执行排序, 直接返回
        if (end - start <= 1) {
            return;
        }

        // 选择一个标尺元素
        int temp = nums[start];

        // 定义两个指针, 一个从左往右, 一个从右往左
        int pointLeft = start;
        int pointRight = end;
        // 比较方向, 为true从左往右, 为false从右往左
        boolean dr = true;

        L1:
        while (pointLeft < pointRight) {
            if (dr) {
                // 从右往左进行扫描
                for (int i = pointRight; i > pointLeft; i--) {
                    // 如果扫描到的数<=标尺, 将他替换到标尺位置, 然后转换扫描方向, 从标尺的下一个位置进行扫描
                    if (nums[i] <= temp) {
                        nums[pointLeft++] = nums[i];
                        pointRight = i;
                        dr = !dr;
                        continue L1;
                    }
                }
                pointRight = pointLeft;
            } else {
                // 从左往右扫描
                for (int i = pointLeft; i < pointRight; i++) {

                    if (nums[i] >= temp) {
                        nums[pointRight--] = nums[i];
                        pointLeft = i;
                        dr = !dr;
                        continue L1;
                    }
                }
                pointLeft = pointRight;
            }
        }

        // 将标尺元素放回两个指针相遇的位置
        nums[pointLeft] = temp;


        quickSort(nums, start, pointLeft - 1);
        quickSort(nums, pointLeft + 1, end);
    }


}

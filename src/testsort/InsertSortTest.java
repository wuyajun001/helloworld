package testsort;

import java.util.Arrays;

/**
 * description:<插入排序>
 *
 * @author 武亚军 (wuyajun0928@aliyun.com)
 * @version 1.0
 * @date 2019/8/8 14:12
 */
public class InsertSortTest {

    public static void main(String[] args) {
        int[] nums = {0, 12, 17, 13, 5, 8, 6, 15, 3, 22, 36, 49, 1, 50};
        System.out.println("排序前: " + Arrays.toString(nums));
        insertSort(nums);
        System.out.println("\n排序后: " + Arrays.toString(nums));
    }


    public static void insertSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            insertOne(nums, i);
        }
    }

    /**
     * Description: 插入排序的一次操作
     *
     * @param: nums 数组
     * @return:
     * @auther: 武亚军(wuyajun0928 @ aliyun.com)
     */
    public static void insertOne(int[] nums, int k) {
        for (int i = 0; i <= k; i++) {
            if (nums[i] > nums[k]) {
                int temp = nums[k];
                // 将k之前的元素向K的方向移动一位
                for (int j = k - 1; j >= i; j--) {
                    nums[j + 1] = nums[j];
                }
                nums[i] = temp;
            }
        }
    }


}

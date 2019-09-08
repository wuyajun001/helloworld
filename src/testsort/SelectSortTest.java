package testsort;

import java.util.Arrays;

/**
 * description:<选择排序>
 *
 * @author 武亚军 (wuyajun0928@aliyun.com)
 * @version 1.0
 * @date 2018/8/8 13:44
 */
public class SelectSortTest {

    public static void main(String[] args) {
        int[] nums = {0, 12, 17, 13, 5, 8, 6, 15, 3, 22, 36, 49, 1, 50};
        System.out.println("排序前: " + Arrays.toString(nums));
        selectSort(nums);
        System.out.println("\n排序后: " + Arrays.toString(nums));
    }


    private static void selectSort(int[] nums) {
        /*
         * 经过selectOne方法测试我们可以看出, 每次排序就会将一个最小值排到对应位置
         * 比如两个元素, 我们最多排序依次就够了, 所以这里应该排元素数量-1次就可以了
         */
        for (int i = 0; i < nums.length - 1; i++) {
            selectOne(nums, i);
        }
    }


    private static void selectOne(int[] nums, int begin) {
        // 假设begin为最小元素所在位置
        int point = begin;

        // 进行遍历, 找到最小元素, 并将最小元素的位置赋值给point
        for (int i = point + 1; i < nums.length; i++) {
            if (nums[i] < nums[point]) {
                point = i;
            }
        }

        // 将二者位置交换
        int temp = nums[point];
        nums[point] = nums[begin];
        nums[begin] = temp;
    }


}

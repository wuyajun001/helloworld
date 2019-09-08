package testsort;

import java.util.List;

/**
 * description:<冒泡排序>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/7/4 15:45
 */
public class BubbleSortTest {

    public static void main(String[] args) {
        Integer listSize = 200;
        List<Integer> numList = CommonUtils.getNumList(listSize);
        System.out.println("排序前: " + numList);
        bubbleSort(numList);
        System.out.println("排序后: " + numList);
    }

    /**
     * description:<对集合进行冒泡排序>
     *
     * @param numList 需要排序的集合
     * @author 武亚军 (yajun.wu@ucarinc.com)
     * @date 2019/7/4 15:52
     * @result void
     */
    public static void bubbleSort(List<Integer> numList) {
        if (numList == null) {
            return;
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < numList.size(); i++) {
            for (int j = 0; j < numList.size() - i - 1; j++) {
                if (numList.get(j) > numList.get(j + 1)) {
                    Integer temp = numList.get(j);
                    numList.set(j, numList.get(j + 1));
                    numList.set(j + 1, temp);
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("排序用时:"+(end-start)+"毫秒");
    }


}

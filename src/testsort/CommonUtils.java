package testsort;

import java.util.*;

/**
 * description:<基础方法>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/7/4 15:53
 */
public class CommonUtils {


    public static void main(String[] args) {
        getNumList(10);
    }


    /**
     * description:<获取一个集合>
     *
     * @author 武亚军 (yajun.wu@ucarinc.com)
     * @date 2019/7/4 15:47
     * @result java.util.List
     */
    public static List<Integer> getNumList(Integer listSize) {
        Set<Integer> numSet = new HashSet<>(16);
        while (numSet.size() < listSize) {
            numSet.add(new Random().nextInt(listSize + 10));
        }

        Iterator<Integer> iterator = numSet.iterator();
        List<Integer> numList = new ArrayList<>(16);
        while (iterator.hasNext()) {
            numList.add(iterator.next());
        }
        return numList;
    }
}

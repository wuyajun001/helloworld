package design.factory;

import design.factory.human.Human;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * description:<根据一个接口获取同一包下所有的实现类>
 *
 * @author 武亚军 (yajun.wu@ucarinc.com)
 * @version 1.0
 * @date 2019/8/12 18:03
 */
public class ClassUtils {

    public static void main(String[] args) {
        List<Class> allClassByInterface = getAllClassByInterface(Human.class);
        System.out.println(allClassByInterface);
    }


    /**
     * description:<根据一个接口获取同一包下所有的实现类>
     *
     * @param clazz 传入的接口
     * @author 武亚军 (yajun.wu@ucarinc.com)
     * @date 2019/8/12 18:25
     * @result java.util.List<java.lang.Class>
     */
    public static List<Class> getAllClassByInterface(Class clazz) {
        List<Class> classes = new ArrayList<>(8);
        // 如果接口是一个接口
        if (clazz.isInterface()) {
            // 获得当前包名
            String currentPackageName = clazz.getPackage().getName();

            try {
                List<Class> allClass = getAllClass(currentPackageName);
                for (Class cl : allClass) {
                    if (!clazz.equals(cl) && clazz.isAssignableFrom(cl)) {
                        classes.add(cl);
                    }
                }
            } catch (Exception e) {
                System.out.println("出错了!");
            }
        }
        return classes;
    }

    /**
     * description:<获取当前包下所有的类>
     *
     * @param packageName 包名
     * @author 武亚军 (yajun.wu@ucarinc.com)
     * @date 2019/8/12 18:25
     * @result java.util.List<java.lang.Class>
     */
    private static List<Class> getAllClass(String packageName) throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace(".", "/");
        Enumeration<URL> resources = classLoader.getResources(path);

        List<File> files = new ArrayList<>(10);

        while (resources.hasMoreElements()) {
            URL url = resources.nextElement();
            files.add(new File(url.getFile()));
        }

        List<Class> classes = new ArrayList<>(10);

        for (File file : files) {
            classes.addAll(findClass(file, packageName));
        }

        return classes;
    }


    private static List<Class> findClass(File dir, String packageName) throws ClassNotFoundException {
        List<Class> classes = new ArrayList<>(10);
        if (!dir.exists()) {
            return classes;
        }

        File[] files = dir.listFiles();
        String endName = ".class";
        for (File file : files) {
            if (file.isDirectory() && !file.getName().contains(".")) {
                classes.addAll(findClass(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(endName)) {
                classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - endName.length())));
            }
        }

        return classes;
    }


}

package cn.seits.common.utils;
/**
 * @author jolsyn E-mail:822346113@qq.com
 * @version 创建时间：2017/9/19 17:44
 */
public class ArrayUtil {
    public ArrayUtil() {
    }

    public static <T> T[] concat(T[] a, T[] b) {
        final int alen = a.length;
        final int blen = b.length;
        if (alen == 0) {
            return b;
        }
        if (blen == 0) {
            return a;
        }
        final T[] result = (T[]) java.lang.reflect.Array.
                newInstance(a.getClass().getComponentType(), alen + blen);
        System.arraycopy(a, 0, result, 0, alen);
        System.arraycopy(b, 0, result, alen, blen);
        return result;
    }


}

package mvp_master.mvp.helper;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月10日14:54:36
 * Description:
 */
public class GenericHelper {

    public static <T> Class<T> getViewClass(Class<?> klass){
        Type type = klass.getGenericSuperclass();
        if(type == null || !(type instanceof ParameterizedType)) return null;
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type[] types = parameterizedType.getActualTypeArguments();
        if(types == null || types.length == 0) return null;
        return (Class<T>) types[0];
    }
}

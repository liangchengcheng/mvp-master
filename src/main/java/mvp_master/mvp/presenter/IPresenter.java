package mvp_master.mvp.presenter;

import android.os.Bundle;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:  2015年12月10日14:15:10
 * Description:  Presenter的根接口
 */
public interface IPresenter<T> {

    /**
     * 获取当前的presenter
     */
    Class<T> getViewClass();

    /**
     * View初始化之前可以在此方法做一些操作
     */
    void create(Bundle saveInstance);

    /**
     * View 初始化完毕后调用
     */
    void created(Bundle saveInstance);
}

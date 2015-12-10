package mvp_master.mvp.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mvp_master.mvp.presenter.IPresenter;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月9日23:31:39
 * Description:  View层的根接口
 */
public interface IView {

    /**
     *根据getLayout的方法生成根布局
     */
    View create(LayoutInflater inflater,ViewGroup container);

    /**
     * 当Activity onCreate完毕的时候调用
     */
    void  created();

    /**
     * 返回当前视图需要的layout的id
     */
    int getLayoutId();

    /**
     * 根据id获取view
     */
    <V extends  View> V findViewById(int id);

    /**
     * 绑定Presenter
     */
    void bindPresenter(IPresenter presenter);

    /**
     * created后调用设置点击事件
     */
    void bindEvent();

}

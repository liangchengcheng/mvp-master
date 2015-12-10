package mvp_master.mvp.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mvp_master.mvp.presenter.IPresenter;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月10日14:23:51
 * Description:
 */
public abstract class ViewImpl implements IView {

    /**
     * create生成的view
     */
    protected View mRootView;

    /**
     *绑定的presenter
     */
    protected IPresenter mPresenter;

    @Override
    public View create(LayoutInflater inflater, ViewGroup container) {
        mRootView=inflater.inflate(getLayoutId(),container,false);
        created();
        return mRootView;
    }

    @Override
    public <V extends View> V findViewById(int id) {
        return (V) mRootView.findViewById(id);
    }

    @Override
    public void created() {

    }

    @Override
    public void bindPresenter(IPresenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void bindEvent() {

    }
}

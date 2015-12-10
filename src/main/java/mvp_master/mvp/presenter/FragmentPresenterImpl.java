package mvp_master.mvp.presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mvp_master.mvp.helper.GenericHelper;
import mvp_master.mvp.view.IView;


/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月10日15:36:08
 * Description: Fragment作为基类
 */
public class FragmentPresenterImpl<T extends IView> extends Fragment implements IPresenter<T> {

    protected T mView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        create(savedInstanceState);
        try {
            mView = getViewClass().newInstance();
            View view = mView.create(inflater, container);
            mView.bindPresenter(this);
            mView.bindEvent();
            created(savedInstanceState);
            return view;
        } catch(Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Class<T> getViewClass() {
        return GenericHelper.getViewClass(getClass());
    }

    @Override
    public void create(Bundle savedInstance) {

    }

    @Override
    public void created(Bundle savedInstance) {

    }
}

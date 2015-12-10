package mvp_master.mvp.presenter;

import mvp_master.mvp.helper.GenericHelper;
import mvp_master.mvp.view.IView;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月10日15:32:06
 * Description:
 */
public class FragmentActivityPresenterImpl<T extends IView>  extends FragmentActivity implements IPresenter<T>{

    protected T mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        create(savedInstanceState);

        try {
            mView = getViewClass().newInstance();
            mView.bindPresenter(this);
            setContentView(mView.create(getLayoutInflater(), null));
            mView.bindEvent();
            created(savedInstanceState);
        } catch(Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Class<T> getViewClass() {
        return GenericHelper.getViewClass(getClass());
    }

    @Override
    public void create(Bundle saveInstance) {

    }

    @Override
    public void created(Bundle saveInstance) {

    }
}

package mvp_master.mvp.presenter;

import android.app.Activity;
import android.os.Bundle;

import mvp_master.mvp.helper.GenericHelper;
import mvp_master.mvp.view.IView;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:  2015年12月10日14:34:18
 * Description:将Activity作为Preseter的基类
 */
public class ActivityPresenterImpl <T extends IView> extends Activity implements IPresenter<T>{

    protected T mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        create(savedInstanceState);

        try{
            mView =getViewClass().newInstance();
            mView.bindPresenter(this);
            setContentView(mView.create(getLayoutInflater(),null));
            mView.bindEvent();
            created(savedInstanceState);
        }catch (Exception e){
            throw  new RuntimeException(e.getMessage());
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

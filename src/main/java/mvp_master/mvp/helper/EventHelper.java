package mvp_master.mvp.helper;

import android.view.View;
import android.widget.AdapterView;

import mvp_master.mvp.presenter.IPresenter;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月10日15:05:42
 * Description:  事件帮助类，提供click,longClick itemClick等常用事件的封装
 */
public class EventHelper {


    public static void click(IPresenter li, View ...views) {
        if(!(li instanceof View.OnClickListener)) return;
        click((View.OnClickListener) li, views);
    }

    public static void longClick(IPresenter li, View ...views) {
        if(!(li instanceof View.OnLongClickListener)) return;
        longClick((View.OnLongClickListener) li, views);
    }

    public static void itemClick(IPresenter li, AdapterView ...views) {
        if(!(li instanceof AdapterView.OnItemClickListener)) return;
        itemClick((AdapterView.OnItemClickListener) li, views);
    }

    public static void itemLongClick(IPresenter li, AdapterView ... views) {
        if(!(li instanceof AdapterView.OnItemLongClickListener)) return;
        itemLongClick((AdapterView.OnItemLongClickListener) li, views);
    }

    public static void itemSelected(IPresenter li, AdapterView ...views) {
        if (!(li instanceof AdapterView.OnItemSelectedListener)) return;
        itemSelected((AdapterView.OnItemSelectedListener) li, views);
    }

    /**
     * 设置点击事件
     * @param li 点击事件
     * @param views 控件
     */
    public static  void click(View.OnClickListener li,View...views){
        if (views==null || views.length==0)return;
        for (View v :views)v.setOnClickListener(li);
    }

    /**
     * 设置长按事件
     * @param li 长按事件
     * @param views 控件
     */
    public static void longClick(View.OnLongClickListener li, View ...views) {
        if(views == null || views.length == 0) return;
        for(View v : views) v.setOnLongClickListener(li);
    }

    /**
     * 设置条目点击事件
     * @param li 条目点击事件
     * @param views 控件
     */
    public static void itemClick(AdapterView.OnItemClickListener li, AdapterView ...views) {
        if(views == null || views.length == 0) return;
        for(AdapterView v : views) v.setOnItemClickListener(li);
    }

    /**
     * 设置条目长按事件
     * @param li 条目长按事件
     * @param views 控件
     */
    public static void itemLongClick(AdapterView.OnItemLongClickListener li, AdapterView ... views) {
        if(views == null || views.length == 0) return;
        for(AdapterView v : views) v.setOnItemLongClickListener(li);
    }

    /**
     * 设置条目选中事件
     * @param li 条目选中事件
     * @param views 控件
     */
    public static void itemSelected(AdapterView.OnItemSelectedListener li, AdapterView ...views) {
        if(views == null || views.length == 0) return;
        for(AdapterView v : views) v.setOnItemSelectedListener(li);
    }
}

package mvp_master.demo;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import mvp_master.mvp.helper.EventHelper;
import mvp_master.mvp.view.ViewImpl;

public class MainView extends ViewImpl {

    private TextView mTextView;
    private ProgressBar mProgressBar;

    @Override
    public void created() {
        mProgressBar = findViewById(R.id.progress);
        mTextView = findViewById(R.id.tv);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    public void setProgress(int progress) {
        mProgressBar.setProgress(progress);
    }

    public void setText(String text) {
        mTextView.setText(text);
    }

    public String getText() {
        return mTextView.getText().toString().trim();
    }

    public void showToast(String toast) {

    }

    public void setTextClickListener(View.OnClickListener li) {
        EventHelper.click(li, mTextView);
    }
}

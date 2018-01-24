package acffo.xqx.xtoast;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import acffo.xqx.xtoast_lib.XToastHelper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnMsg;
    private Button btnMsgImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEvent();
    }

    private void initEvent() {
        btnMsg.setOnClickListener(this);
        btnMsgImg.setOnClickListener(this);
    }

    private void initView() {
        btnMsg = (Button) findViewById(R.id.btnMsg);
        btnMsgImg = (Button) findViewById(R.id.btnMsgImg);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnMsg:
                // 红色 18sp 短时间显示 吐司
                XToastHelper.getInstance()
                        .setTxtColor(getResources().getColor(R.color.colorAccent))
                        .setTxtSize(18)
                        .setDuration(Toast.LENGTH_SHORT)
                        .setBgColor(Color.parseColor("#2222ff"))
                        .showXToast(this,"这是提示文字" );
                break;
            case R.id.btnMsgImg:
                XToastHelper.getInstance()
//                        .setTxtColor(getResources().getColor(R.color.colorAccent))
//                        .setTxtSize(14)
//                        .setDuration(Toast.LENGTH_SHORT)
//                        .setBgColor(Color.parseColor("#2222ff"))
                        .showXToast(this,"这是提示文字" , R.mipmap.icon_about);
                break;
        }
    }
}

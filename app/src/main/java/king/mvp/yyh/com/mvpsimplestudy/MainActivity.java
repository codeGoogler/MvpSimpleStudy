package king.mvp.yyh.com.mvpsimplestudy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import king.mvp.yyh.com.mvpsimplestudy.model.login_mvp.MainLoginTestActivity;
/**
 * 类功能描述：</br>
 *
 * 博客地址：http://blog.csdn.net/androidstarjack
 * 公众号：终端研发部
 * @author yuyahao
 * @version 1.0 </p> 修改时间：</br> 修改备注：</br>
 */
public class MainActivity extends AppCompatActivity {
    @Bind(R.id.btn_01)
    Button btn_01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btn_01 = (Button) findViewById(R.id.btn_01);
        btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainLoginTestActivity.class));
            }
        });
    }
    @OnClick({R.id.btn_01})
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_01:

                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}

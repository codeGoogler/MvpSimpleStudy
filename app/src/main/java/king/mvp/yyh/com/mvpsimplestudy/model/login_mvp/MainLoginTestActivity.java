package king.mvp.yyh.com.mvpsimplestudy.model.login_mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import king.mvp.yyh.com.mvpsimplestudy.R;
import king.mvp.yyh.com.mvpsimplestudy.model.login_mvp.p.LoginPresenter;
import king.mvp.yyh.com.mvpsimplestudy.model.login_mvp.v.LoginView;
import king.mvp.yyh.com.mvpsimplestudy.utils.GetToast;

/**
 * Created by Administrator on 2017/9/13/013.
 */

public class MainLoginTestActivity extends AppCompatActivity  implements  LoginView{
    @Bind(R.id.et_password)
    EditText et_password;
    @Bind(R.id.et_account)
    EditText et_account;
    @Bind(R.id.btn_cancle)
    Button btn_cancle;
    @Bind(R.id.btn_ok)
    Button btn_ok;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_test);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_cancle,R.id.btn_ok})
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_cancle:
                String name = et_account .getText().toString();
                String pass = et_password .getText().toString();
                LoginPresenter loginPresenter = new LoginPresenter(this);
                loginPresenter.login(name,pass);
                break;
            case R.id.btn_ok:

                break;
        }
    }
    @Override
    public void loginListener(Object obj) {
        User user = (User) obj;
        if(user.getCode() == 0){ //请求成功
            GetToast.useString(MainLoginTestActivity.this,user.getMsg());
        }else{
            GetToast.useString(MainLoginTestActivity.this,user.getMsg());
        }
    }
}

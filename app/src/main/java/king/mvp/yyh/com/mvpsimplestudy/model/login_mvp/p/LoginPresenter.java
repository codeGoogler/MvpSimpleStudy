package king.mvp.yyh.com.mvpsimplestudy.model.login_mvp.p;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import king.mvp.yyh.com.mvpsimplestudy.model.login_mvp.User;
import king.mvp.yyh.com.mvpsimplestudy.model.login_mvp.m.LoginModel;
import king.mvp.yyh.com.mvpsimplestudy.model.login_mvp.v.LoginView;
import king.mvp.yyh.com.mvpsimplestudy.utils.net.HttpUtils;

/**
 * 类功能描述：</br>
 * P层:
 * 特点：持有UI层和数据层引用
 * 博客地址：http://blog.csdn.net/androidstarjack
 * 公众号：终端研发部
 * @author yuyahao
 * @version 1.0 </p> 修改时间：</br> 修改备注：</br>
 */
public class LoginPresenter {
    /**
     *持有View层的引用
     */
    LoginView loginView;
    /**
     * 同时持有 model层的引用
     */
    LoginModel loginModel;

    public  LoginPresenter(LoginView loginView){
        this.loginView = loginView;
        loginModel = new LoginModel();
    }
    public void login(String name,String password){
        loginModel.login(name, password, new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {
                User user = JSON.parseObject(result,User.class);
                loginView.loginListener(user);
            }
        });
    }
}

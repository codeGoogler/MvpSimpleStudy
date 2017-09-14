package king.mvp.yyh.com.mvpsimplestudy.model.login_mvp.m;


import king.mvp.yyh.com.mvpsimplestudy.utils.net.HttpTask;
import king.mvp.yyh.com.mvpsimplestudy.utils.net.HttpUtils;

/**
 * M层接口
 *   1. 向数据源发起请求；
 *   通知Presenter处理结果。
 */
public class LoginModel {
    public void login(String username, String password, final HttpUtils.OnHttpResultListener
            onHttpResultListener){
        HttpTask httpTask = new HttpTask(new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {
                onHttpResultListener.onResult(result);
            }
        });
        httpTask.execute("http://192.168.1.113:8080/Login/LoginResServlet?action=login",
                username, password);
    }
}

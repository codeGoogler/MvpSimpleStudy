package king.mvp.yyh.com.mvpsimplestudy.model.login_mvp;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/9/13/013.
 */

public class User implements Serializable{
    public int code;
    public String msg;
    public Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

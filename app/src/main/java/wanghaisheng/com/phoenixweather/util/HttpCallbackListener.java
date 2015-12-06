package wanghaisheng.com.phoenixweather.util;

/**
 * Created by sheng on 2015/12/5.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}

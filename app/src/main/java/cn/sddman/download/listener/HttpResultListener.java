package cn.sddman.download.listener;

public interface HttpResultListener {
    void onSuccess(String result);
    void onError(Throwable ex);
}

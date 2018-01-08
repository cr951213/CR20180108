package com.example.administrator.cr20180108.model;


import com.example.administrator.cr20180108.bean.Add;
import com.example.administrator.cr20180108.net.NetWorkListener;
import com.example.administrator.cr20180108.util.RetrofitHelper;
import com.example.administrator.cr20180108.util.ServerApi;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by ZMoffice on 2018.1.8.
 */

public class Shixian2 implements Imodel2 {
    @Override
    public void getAdd(String pid,final NetWorkListener<Add> netWorkListener) {
        ServerApi serverApi = RetrofitHelper.getServerApi();
        serverApi.getadd(pid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Add>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Add detail) {
                        netWorkListener.onSuccess(detail);
                    }
                });
    }

}

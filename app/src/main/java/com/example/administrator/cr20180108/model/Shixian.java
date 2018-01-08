package com.example.administrator.cr20180108.model;


import com.example.administrator.cr20180108.bean.Detail;
import com.example.administrator.cr20180108.net.NetWorkListener;
import com.example.administrator.cr20180108.util.RetrofitHelper;
import com.example.administrator.cr20180108.util.ServerApi;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by ZMoffice on 2018.1.8.
 */

public class Shixian implements Imodel {
    @Override
    public void getdetail(final NetWorkListener<Detail> netWorkListener) {
        ServerApi serverApi = RetrofitHelper.getServerApi();
        serverApi.getxq()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Detail>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Detail detail) {
                        netWorkListener.onSuccess(detail);
                    }
                });
    }
}

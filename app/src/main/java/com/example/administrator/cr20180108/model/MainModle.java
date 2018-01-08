package com.example.administrator.cr20180108.model;


import com.example.administrator.cr20180108.bean.MsgBean;
import com.example.administrator.cr20180108.bean.ShopCarBean;
import com.example.administrator.cr20180108.net.NetWorkListener;
import com.example.administrator.cr20180108.util.RetrofitHelper;
import com.example.administrator.cr20180108.util.ServerApi;

import java.util.HashMap;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by ZMoffice on 2018.1.8.
 */

public class MainModle implements IMainModle {

    //展示购物车数据
    @Override
    public void postCar(String uid, final NetWorkListener<ShopCarBean> netWorkListener) {

        ServerApi serverApi = RetrofitHelper.getServerApi();
        serverApi.shopCall(uid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ShopCarBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        netWorkListener.onError((Exception) e);
                    }

                    @Override
                    public void onNext(ShopCarBean shopCarBean) {
                        netWorkListener.onSuccess(shopCarBean);
                    }
                });
    }

    //删除购物车
    @Override
    public void postDelCar(HashMap<String, String> hashMap, final NetWorkListener<MsgBean> netWorkListener) {
        ServerApi serverApi = RetrofitHelper.getServerApi();
        serverApi.msgCall(hashMap)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MsgBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        netWorkListener.onError((Exception) e);
                    }

                    @Override
                    public void onNext(MsgBean msgBean) {
                        netWorkListener.onSuccess(msgBean);
                    }
                });
    }

    //更新购物车数据
    @Override
    public void postUpdaterCar(HashMap<String, String> hashMap, final NetWorkListener<MsgBean> netWorkListener) {
        ServerApi serverApi = RetrofitHelper.getServerApi();
        serverApi.msgCall(hashMap)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MsgBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        netWorkListener.onError((Exception) e);
                    }

                    @Override
                    public void onNext(MsgBean msgBean) {
                        netWorkListener.onSuccess(msgBean);
                    }
                });
    }
}

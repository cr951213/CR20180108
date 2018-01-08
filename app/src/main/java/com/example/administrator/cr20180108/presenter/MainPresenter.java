package com.example.administrator.cr20180108.presenter;


import com.example.administrator.cr20180108.bean.MsgBean;
import com.example.administrator.cr20180108.bean.ShopCarBean;
import com.example.administrator.cr20180108.model.IMainModle;
import com.example.administrator.cr20180108.model.MainModle;
import com.example.administrator.cr20180108.net.NetWorkListener;
import com.example.administrator.cr20180108.util.Api;
import com.example.administrator.cr20180108.view.IMainActivity;

import java.util.HashMap;

/**
 * Created by ZMoffice on 2018.1.8.
 */

public class MainPresenter {
    IMainActivity iMainActivity;
    IMainModle iMainModle;

    public MainPresenter(IMainActivity iMainActivity) {
        this.iMainActivity = iMainActivity;
        iMainModle=new MainModle();
    }

    //购物车数据
    public void postShopCar()
    {
        iMainModle.postCar(Api.uid, new NetWorkListener<ShopCarBean>() {
            @Override
            public void onError(Exception e) {

            }

            @Override
            public void onSuccess(ShopCarBean shopCarBean) {
                iMainActivity.showShopCar(shopCarBean);
            }
        });
    }
    //删除购物车
    public void postDelCar(String uid,String pid)
    {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("uid",uid);
        hashMap.put("pid",pid);
        iMainModle.postDelCar(hashMap, new NetWorkListener<MsgBean>() {
            @Override
            public void onError(Exception e) {

            }

            @Override
            public void onSuccess(MsgBean msgBean) {
                iMainActivity.showDelCar(msgBean);
            }
        });
    }

    //
    public void doDview()
    {
        iMainActivity=null;
    }
}

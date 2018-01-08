package com.example.administrator.cr20180108.model;


import com.example.administrator.cr20180108.bean.MsgBean;
import com.example.administrator.cr20180108.bean.ShopCarBean;
import com.example.administrator.cr20180108.net.NetWorkListener;

import java.util.HashMap;

/**
 * Created by ZMoffice on 2018.1.8.
 */

public interface IMainModle {
    //展示购物车数据
    public void postCar(String uid, NetWorkListener<ShopCarBean> netWorkListener);
    //删除购物车
    public void postDelCar(HashMap<String, String> hashMap, NetWorkListener<MsgBean> netWorkListener);
    //更新购物车
    public void postUpdaterCar(HashMap<String, String> hashMap, NetWorkListener<MsgBean> netWorkListener);
}

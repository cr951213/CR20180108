package com.example.administrator.cr20180108.view;


import com.example.administrator.cr20180108.bean.MsgBean;
import com.example.administrator.cr20180108.bean.ShopCarBean;

/**
 * Created by ZMoffice on 2018.1.8.
 */

public interface IMainActivity {
    //展示购物车数据
    public void showShopCar(ShopCarBean shopCarBean);
    //删除购物车数据
    public void showDelCar(MsgBean msgBean);
}

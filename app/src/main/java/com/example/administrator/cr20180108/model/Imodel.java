package com.example.administrator.cr20180108.model;


import com.example.administrator.cr20180108.bean.Detail;
import com.example.administrator.cr20180108.net.NetWorkListener;

/**
 * Created by ZMoffice on 2018.1.8.
 */

public interface Imodel {
    public void getdetail(NetWorkListener<Detail> netWorkListener);
}

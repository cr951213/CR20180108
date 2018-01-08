package com.example.administrator.cr20180108.model;


import com.example.administrator.cr20180108.bean.Add;
import com.example.administrator.cr20180108.net.NetWorkListener;

/**
 * Created by ZMoffice on 2018.1.8.
 */

public interface Imodel2 {
    public void getAdd(String pid, NetWorkListener<Add> netWorkListener);
}

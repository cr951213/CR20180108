package com.example.administrator.cr20180108.presenter;

import android.content.Context;

import com.example.administrator.cr20180108.bean.Add;
import com.example.administrator.cr20180108.model.Imodel2;
import com.example.administrator.cr20180108.net.NetWorkListener;
import com.example.administrator.cr20180108.view.Iview2;


/**
 * Created by ZMoffice on 2018.1.8.
 */

public class P3 {
    Iview2 iview2;
    Imodel2 imodel2;
    Context context;
String pid;

    public P3(Iview2 iview2, Context context, String pid) {
        this.iview2 = iview2;
        this.context = context;
        this.pid = pid;
    }

    public void getadd()
    {
        imodel2.getAdd(pid,new NetWorkListener<Add>() {
            @Override
            public void onError(Exception e) {

            }

            @Override
            public void onSuccess(Add detail) {
                iview2.getbean(detail);
            }
        });
    }
}

package com.example.administrator.cr20180108.presenter;

import android.content.Context;

import com.example.administrator.cr20180108.bean.Detail;
import com.example.administrator.cr20180108.model.Imodel;
import com.example.administrator.cr20180108.model.Shixian;
import com.example.administrator.cr20180108.net.NetWorkListener;
import com.example.administrator.cr20180108.view.Iview;


/**
 * Created by ZMoffice on 2018.1.8.
 */

public class P2 {
    Iview iview;
    Imodel imodel;
    Context context;

    public P2(Iview iview, Context context) {
        this.iview = iview;
        this.context = context;
        imodel=new Shixian();
    }
    public void getdetail()
    {
        imodel.getdetail(new NetWorkListener<Detail>() {
            @Override
            public void onError(Exception e) {

            }

            @Override
            public void onSuccess(Detail detail) {
                   iview.getbean(detail);
            }
        });
    }
}

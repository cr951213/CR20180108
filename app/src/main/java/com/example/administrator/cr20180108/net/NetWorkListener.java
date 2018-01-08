package com.example.administrator.cr20180108.net;

/**
 * Created by ZMoffice on 2018.1.8.
 */

public interface NetWorkListener<T>{

    public void onError(Exception e);
    public void onSuccess(T t);
}

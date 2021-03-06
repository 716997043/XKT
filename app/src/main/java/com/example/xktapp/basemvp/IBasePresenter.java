package com.example.xktapp.basemvp;

public interface IBasePresenter {

    void attach(IBaseView view);

    void detach();
}

package com.dexter.mvplogin;

import android.view.View;

public class LoginPresenterImpl implements LoginContract.LoginPresenter{

    LoginContract.LoginView mView;

    LoginPresenterImpl(LoginContract.LoginView view){
        mView=view;
    }

    @Override
    public void handleSingInButtonClick(View v) {
        mView.showHomeScreen();
    }
}

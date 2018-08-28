package com.dexter.mvplogin;

import android.view.View;

public class LoginContract {
    interface LoginView{
        void showHomeScreen();
    }

    interface LoginPresenter{
        void handleSingInButtonClick(View v);
    }
}

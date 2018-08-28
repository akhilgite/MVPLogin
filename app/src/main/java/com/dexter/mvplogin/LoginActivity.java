package com.dexter.mvplogin;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dexter.mvplogin.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity implements LoginContract.LoginView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_login);

        ActivityLoginBinding loginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        LoginPresenterImpl loginPresenter=new LoginPresenterImpl(this);
        loginBinding.setLoginPresenter(loginPresenter);
    }

    @Override
    public void showHomeScreen() {
        startActivity(new Intent(this,MainActivity.class));
    }
}

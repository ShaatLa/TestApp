package com.shaatla.testapp;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;
import android.widget.TextView;

import com.shaatla.testapp.Models.PersonalData;
import com.shaatla.testapp.injections.DaggerMainActivityComponent;
import com.shaatla.testapp.injections.MainActivityComponent;
import com.shaatla.testapp.injections.ServerConnectionModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainView {

    @Inject
    MainActivityPresenter mainActivityPresenter;

    @BindView(R.id.textView)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        DaggerMainActivityComponent
                .builder()
                .build()
                .inject(this);

        mainActivityPresenter.getData();
    }

    public void showData(PersonalData personalData) {
        textView.setText(personalData.getDate());
    }
}

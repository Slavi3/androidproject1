package com.example.stan.androidproject4;

import android.app.Activity;
import android.os.Bundle;

public class BulgarianBorderdirectionActivity extends Activity {

    private BulgarianBorderdirectionFragment mBulgarianBorderdirectionFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulgarian_borderdirection);
        mBulgarianBorderdirectionFragment = BulgarianBorderdirectionFragment.newInstance();
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.content, mBulgarianBorderdirectionFragment)
                .commit();

    }
}

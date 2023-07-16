package androidx.leanback.leanbackshowcase.app;

import android.app.Activity;
import android.os.Bundle;

import androidx.leanback.leanbackshowcase.R;

public class SplashActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
    }
}

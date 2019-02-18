package baway.com.niuhongjie0218.util;

import android.app.Application;
import android.os.Environment;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.io.File;

public class Applica extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        File file = new File(Environment.getExternalStorageDirectory(), "a.txt");

        //  new ImageLoaderConfiguration.Builder(this)

    }
}

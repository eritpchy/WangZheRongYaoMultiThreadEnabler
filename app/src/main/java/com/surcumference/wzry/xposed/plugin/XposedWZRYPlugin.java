package com.surcumference.wzry.xposed.plugin;

import android.content.Context;
import android.os.Build;


import com.surcumference.wzry.BuildConfig;

import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/**
 * Created by Jason on 2017/9/8.
 */

public class XposedWZRYPlugin {

    public void main(final Context context, final XC_LoadPackage.LoadPackageParam lpparam) {
        XposedBridge.log("Xposed plugin[" + BuildConfig.APPLICATION_ID + "] init version: " + BuildConfig.VERSION_NAME);
        try {
            XposedHelpers.setStaticObjectField(Build.class, "MANUFACTURER", "OPPO");
            XposedHelpers.setStaticObjectField(Build.class, "MODEL", "OPPO R11");
            XposedHelpers.setStaticObjectField(Build.class, "BRAND", "OPPO");
        } catch (Throwable l) {
            XposedBridge.log(l);
        }
    }
}

package com.binarybears.regame.DataLayer;

import android.content.Intent;

/**
 * Created by treetender on 4/15/16.
 * Consoles will represent the Emulated Gaming Console
 * that ROMs will be played on.
 */
public class Console {

    /**
     * Let's think about this for a bit too:
     * Consoles will need to have the following:
     * Application Intent that will launch the console
     * The Name of the console
     * Name of the maker of the console
     * Number of ROMs
     * The file extensions the Console Supports
     * Name of the parent Application
     */

    private String mName, mAppName, mMakerName, mIntentArgs;
    private int mRomCount;
    private Intent mLauncher;

    public Console() {}
    public Console(String name, String appName, String makerName, Intent appIntent, String intentArgs)
    {
        mName = name;
        mAppName = appName;
        mMakerName = makerName;
        mLauncher = appIntent;
        mIntentArgs = intentArgs;
        mRomCount = 0;
    }

    //region Properties
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAppName() {
        return mAppName;
    }

    public void setAppName(String appName) {
        mAppName = appName;
    }

    public String getMakerName() {
        return mMakerName;
    }

    public void setMakerName(String makerName) {
        mMakerName = makerName;
    }

    public String getIntentArgs() {
        return mIntentArgs;
    }

    public void setIntentArgs(String intentArgs) {
        mIntentArgs = intentArgs;
    }

    public int getRomCount() {
        return mRomCount;
    }

    public void setRomCount(int romCount) {
        mRomCount = romCount;
    }

    public Intent getLauncher() {
        return mLauncher;
    }

    public void setLauncher(Intent launcher) {
        mLauncher = launcher;
    }
    //endregion
}

package com.binarybears.regame.DataLayer;

import java.sql.Date;

/**
 * Created by treetender on 4/15/16.
 * Represents a single Game in ReGames.  Games are ROMs that
 * have filepaths, unique IDs, collections of save files, screenshots,
 * and other useful meta data.
 */
public class Game {

    private String mName, mPath;
    private int mRating;
    private Date mLastPlayed;
    private long mTimePlayed, mID;

    /**
     * Lets think about this for a bit:  Games are going to consist of names,
     * paths to their ROM, the type of system they are played on, the save files
     * and save states, the screenshots, last played, how much time played,
     * player's rating
     */

    public Game() { this("New Game", null); }
    public Game(String name, String path) { this(name, path, 0); }
    public Game(String name, String path, int rating)
    {
        mName = name;
        mPath = path;
        mLastPlayed = null;
        mTimePlayed = 0;
        mRating = rating;
    }

    //region Properties
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPath() {
        return mPath;
    }

    public void setPath(String path) {
        mPath = path;
    }

    public int getRating() {
        return mRating;
    }

    public void setRating(int rating) {
        mRating = rating;
    }

    public Date getLastPlayed() {
        return mLastPlayed;
    }

    public void setLastPlayed(Date lastPlayed) {
        mLastPlayed = lastPlayed;
    }

    public long getTimePlayed() {
        return mTimePlayed;
    }

    public void setTimePlayed(long timePlayed) {
        mTimePlayed = timePlayed;
    }

    public long getID() {
        return mID;
    }

    public void setID(long ID) {
        this.mID = ID;
    }
    //endregion


    @Override
    public String toString() {
        return mName + " (NES)";
    }
}

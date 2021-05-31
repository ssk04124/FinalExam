package com.accentsoftware.habitual;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Zarif on 2017-08-10.
 */

public class AlarmID extends RealmObject {
    @PrimaryKey
    private int id;
    private long time;
    private long interval;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getInterval() {
        return interval;
    }

    public void setInterval(long interval) {
        this.interval = interval;
    }
}

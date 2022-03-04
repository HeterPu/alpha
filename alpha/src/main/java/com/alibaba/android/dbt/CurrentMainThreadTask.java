package com.alibaba.android.dbt;

import java.util.UUID;

/**
 * @author peterhu
 */
public class CurrentMainThreadTask extends MainThreadTask {


    public CurrentMainThreadTask() {
        super(true);
    }

    @Override
    public void run() {

    }
}

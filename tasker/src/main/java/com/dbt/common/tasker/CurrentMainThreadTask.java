package com.dbt.common.tasker;

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

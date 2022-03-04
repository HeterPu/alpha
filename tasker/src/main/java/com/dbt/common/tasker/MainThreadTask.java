package com.dbt.common.tasker;

import java.util.UUID;

public abstract class MainThreadTask extends Task {

    public MainThreadTask() {
        this(false);
    }

    public MainThreadTask(boolean isCurrentMainThread) {
        super( UUID.randomUUID().toString().substring(0,8),true,isCurrentMainThread);
    }

}

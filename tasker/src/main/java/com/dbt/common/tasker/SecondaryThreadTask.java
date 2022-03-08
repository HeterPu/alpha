package com.dbt.common.tasker;

import java.util.UUID;

public abstract class SecondaryThreadTask extends Task {

    public SecondaryThreadTask() {
        this(false);
    }

    public SecondaryThreadTask(boolean isCurrentThread) {
        super( UUID.randomUUID().toString().substring(0,8),false,isCurrentThread);
    }


}

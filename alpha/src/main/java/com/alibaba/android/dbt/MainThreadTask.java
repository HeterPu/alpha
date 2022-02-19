package com.alibaba.android.dbt;

import java.util.UUID;

public abstract class MainThreadTask extends Task {

    public MainThreadTask() {
        super( UUID.randomUUID().toString().substring(0,8),true);
    }

}

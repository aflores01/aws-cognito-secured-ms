package com.reach.dev.cognito.ms.api.util;

import com.google.gson.Gson;

public interface ToJSON {

    Gson gson = new Gson();

    default String toJson() {
        return new Gson().toJson(this);
    }
}

package com.allegro.training.kotlin.exercises.second;

public class LoggingService {
    private String prefix = "";

    private boolean initiated = false;

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void init() {
        this.initiated = true;
    }

    public void log(String msg) {
        if (initiated) {
            System.out.println(String.format("%s%s", prefix, msg));
        } else {
            throw new IllegalStateException("Not initiated");
        }
    }
}

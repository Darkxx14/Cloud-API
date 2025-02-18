package com.xyrisdev.cloud.api.event;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CloudHandler {
    int priority() default 0;
    boolean async() default false;
}
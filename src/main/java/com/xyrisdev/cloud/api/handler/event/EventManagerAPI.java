package com.xyrisdev.cloud.api.handler.event;

import com.xyrisdev.cloud.api.event.CloudEvent;
import com.xyrisdev.cloud.api.event.CloudListener;

import java.util.concurrent.ExecutorService;

public interface EventManagerAPI {
	void register(Class<?> clazz);

	void registerListener(Class<? extends CloudEvent> eventClass, CloudListener listener, int priority);

	void unregister(Class<?> clazz);

	void unregisterListener(Class<? extends CloudEvent> eventClass, CloudListener listener);

	void trigger(CloudEvent event);

	ExecutorService getAsyncExecutor();
}

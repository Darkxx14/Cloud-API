package com.xyrisdev.cloud.api.event;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class CancellableCloudEvent extends CloudEvent {
	private boolean cancelled = false;
}

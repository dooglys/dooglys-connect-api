package com.dooglys.api.dooglysconnectapi.devices.billacceptor.events;

import functionality.billacceptor.BillAcceptorEvent;
import types.BillAcceptorEventType;

public abstract class BillAcceptorBaseEvent implements BillAcceptorEvent {

	private BillAcceptorEventType eventType;
	
	public BillAcceptorBaseEvent(BillAcceptorEventType eventType) {
		this.eventType = eventType;
	}
	
	public BillAcceptorEventType getEventType() {
		return eventType;
	}
}

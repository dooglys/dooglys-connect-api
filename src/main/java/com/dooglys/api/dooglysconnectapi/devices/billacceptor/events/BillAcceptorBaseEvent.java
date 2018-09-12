package com.dooglys.api.dooglysconnectapi.devices.billacceptor.events;

import com.dooglys.api.dooglysconnectapi.devices.billacceptor.BillAcceptorEvent;
import com.dooglys.api.dooglysconnectapi.devices.billacceptor.BillAcceptorEventType;

public abstract class BillAcceptorBaseEvent implements BillAcceptorEvent {

	private BillAcceptorEventType eventType;
	
	public BillAcceptorBaseEvent(BillAcceptorEventType eventType) {
		this.eventType = eventType;
	}
	
	public BillAcceptorEventType getEventType() {
		return eventType;
	}
}

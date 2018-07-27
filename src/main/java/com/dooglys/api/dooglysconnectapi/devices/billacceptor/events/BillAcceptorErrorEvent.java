package com.dooglys.api.dooglysconnectapi.devices.billacceptor.events;

import types.BillAcceptorEventType;

public class BillAcceptorErrorEvent extends BillAcceptorBaseEvent {

	private String error;
	
	public BillAcceptorErrorEvent(String error) {
		super(BillAcceptorEventType.Error);
		this.error = error;
	}

	public String getError() {
		return error;
	}
}

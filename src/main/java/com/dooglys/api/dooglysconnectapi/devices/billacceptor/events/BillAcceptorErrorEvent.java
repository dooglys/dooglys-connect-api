package com.dooglys.api.dooglysconnectapi.devices.billacceptor.events;

import com.dooglys.api.dooglysconnectapi.devices.billacceptor.BillAcceptorEventType;

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

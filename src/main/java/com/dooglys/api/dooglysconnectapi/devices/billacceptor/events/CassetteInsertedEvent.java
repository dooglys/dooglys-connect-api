package com.dooglys.api.dooglysconnectapi.devices.billacceptor.events;

import types.BillAcceptorEventType;

public class CassetteInsertedEvent extends BillAcceptorBaseEvent {

	public CassetteInsertedEvent() {
		super(BillAcceptorEventType.CassetteInserted);
	}
}

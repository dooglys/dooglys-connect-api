package com.dooglys.api.dooglysconnectapi.devices.billacceptor.events;

import types.BillAcceptorEventType;

public class CassetteRemovedEvent extends BillAcceptorBaseEvent {

	public CassetteRemovedEvent() {
		super(BillAcceptorEventType.CassetteInserted);
	}
}

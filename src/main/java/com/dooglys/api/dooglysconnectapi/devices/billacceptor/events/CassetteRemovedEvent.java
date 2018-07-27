package com.dooglys.api.dooglysconnectapi.devices.billacceptor.events;

import com.dooglys.api.dooglysconnectapi.devices.billacceptor.BillAcceptorEventType;

public class CassetteRemovedEvent extends BillAcceptorBaseEvent {

	public CassetteRemovedEvent() {
		super(BillAcceptorEventType.CassetteInserted);
	}
}

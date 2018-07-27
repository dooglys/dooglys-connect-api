package com.dooglys.api.dooglysconnectapi.devices.billacceptor.events;

import com.dooglys.api.dooglysconnectapi.devices.billacceptor.BillAcceptorEventType;

public class CassetteInsertedEvent extends BillAcceptorBaseEvent {

	public CassetteInsertedEvent() {
		super(BillAcceptorEventType.CassetteInserted);
	}
}

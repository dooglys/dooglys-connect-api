package com.dooglys.api.dooglysconnectapi.devices.billacceptor.events;

import types.BillAcceptorEventType;

public class BanknoteStackedEvent extends BillAcceptorBaseEvent {

	private Integer nominal;
	
	public BanknoteStackedEvent(Integer nominal) {
		super(BillAcceptorEventType.BanknoteStacked);
		this.nominal = nominal;
	}
	
	public Integer getNominal() {
		return nominal;
	}
}

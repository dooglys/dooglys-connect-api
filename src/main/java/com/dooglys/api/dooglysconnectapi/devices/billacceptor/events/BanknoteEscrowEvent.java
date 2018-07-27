package com.dooglys.api.dooglysconnectapi.devices.billacceptor.events;

import types.BillAcceptorEventType;

public class BanknoteEscrowEvent extends BillAcceptorBaseEvent {

	private Integer nominal;
	
	public BanknoteEscrowEvent(Integer nominal) {
		super(BillAcceptorEventType.BanknoteEscrow);
		this.nominal = nominal;
	}
	
	public Integer getNominal() {
		return nominal;
	}
}

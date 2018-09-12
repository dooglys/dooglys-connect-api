package com.dooglys.api.dooglysconnectapi.devices.billacceptor.events;

import com.dooglys.api.dooglysconnectapi.devices.billacceptor.BillAcceptorEventType;

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

package com.dooglys.api.dooglysconnectapi.devices.billacceptor;

import com.dooglys.api.dooglysconnectapi.devices.general.Device;

public interface BillAcceptor extends Device {
	
	/**
	 * Заблокировать/Разблокировать работу купюроприемника
	 */
	public void setEnabled(boolean isEnabled) throws BillAcceptorException;
	
	/**
	 * Положить банкноту в стеккер
	 */
	public void stackingBanknote() throws BillAcceptorException;
	
	/**
	 * Вернуть банкноту
	 */
	public void returnBanknote() throws BillAcceptorException;
	
	/**
	 * Регистрация слушателя
	 * 
	 * @param listener
	 */
	public void addListener(BillAcceptorListener listener);

	/**
	 * Удаление слушателя
	 * 
	 * @param listener
	 */
	public void removeListener(BillAcceptorListener listener);


}

/**
 * 
 */
package com.dooglys.api.dooglysconnectapi.devices.billacceptor;

/**
 * @author denis
 *
 * Слушатель купюроприемника
 */
public interface BillAcceptorListener {

	/**
	 * @param event
	 *
	 * Метод срабатывает при получении событий от купюроприемника
	 *
	 */
	public void handleEvent(BillAcceptorEvent event);

}
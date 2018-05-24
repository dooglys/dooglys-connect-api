/**
 * 
 */
package devices.billacceptor;

import devices.billacceptor.BillAcceptorEvent;

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

package devices.billacceptor;

public interface BillAcceptor {
	
	/**
	 * Заблокировать/Разблокировать работу купюроприемника
	 */
	public void setEnabled(boolean isEnabled);
	
	/**
	 * Положить банкноту в стеккер
	 */
	public void stackingBanknote();
	
	/**
	 * Вернуть банкноту
	 */
	public void returnBanknote();
	
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

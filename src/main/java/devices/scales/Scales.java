package devices.scales;

import devices.general.Device;

public interface Scales extends Device {

    /**
     * Калибровка весов (установка нуля).
     * Используется не на каждой модели весов.
     *
     * @param tareWeight
     * @throws ScalesException
     */
    void calibrate(Double tareWeight) throws ScalesException;

    /**
     * Получить вес
     *
     * @return
     * @throws ScalesException
     */
    double getWeight() throws ScalesException;

}

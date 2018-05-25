package com.dooglys.api.dooglys_connect_api.settings;

import java.util.Iterator;
import java.util.Map;

public class DeviceSettings {

    private Map<String, String> settings;

    public DeviceSettings(Map settings) {
        this.settings = settings;
    }

    public void setSingleSetting(String settingName, String value) {
        settings.put(settingName, value);
    }

    public void setMultipleSettings(Map<String, String> settingsMap) {
        Iterator iterator = settingsMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry setting = (Map.Entry) iterator.next();
            settings.put((String) setting.getKey(), (String) setting.getValue());
        }
    }

    public String getSingleSetting(String settingName) {
        return settings.get(settingName);
    }

}

package com.dooglys.api.dooglysconnectapi.tools;

import com.dooglys.api.dooglysconnectapi.settings.types.OperatingSystem;
import com.dooglys.api.dooglysconnectapi.settings.types.ProcessorArchitecture;

/**
 * Данный класс используется для проверки операционной системы, на которой работает dooglys connect.
 * На данный момент мы поддерживаем windows, linux.
 * Логика кода должна проверять доступную систему, и при отсутствии доступной кидать exception
 */
public class OSChecker {

    public static OperatingSystem getSystem() {
        if (System.getProperty("os.name").toLowerCase().contains("linux")) {
            return OperatingSystem.LINUX;
        }
        else if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            return OperatingSystem.WINDOWS;
        } else {
            return null;
        }
    }

    public static ProcessorArchitecture getArchitecture() {
        if (System.getProperty("os.arch").toLowerCase().contains("32")) {
            return ProcessorArchitecture.x86;
        }
        else if (System.getProperty("os.arch").toLowerCase().contains("64")) {
            return ProcessorArchitecture.x64;
        }
        else if (System.getProperty("os.arch").toLowerCase().contains("arm")) {
            return ProcessorArchitecture.armhf;
        }
        else {
            return null;
        }
    }

}

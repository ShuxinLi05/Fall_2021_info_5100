package com.company;

public interface iBluetooth {
    void pair(String deviceUUID);
    void unpair(String deviceUUID);
    void sendString(String str);
}

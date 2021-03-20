package forge.gui;

import forge.gui.interfaces.IGuiBase;

public class GuiBase {
    private static IGuiBase guiInterface;
    private static boolean propertyConfig = true;
    private static boolean networkplay = false;
    private static boolean isAndroidport = false;
    private static boolean interrupted = false;
    private static String deviceName = "";
    private static String androidRelease = "";
    private static int androidAPI = 0;
    private static int deviceRAM = 0;

    public static IGuiBase getInterface() { return guiInterface; }
    public static void setInterface(IGuiBase i0) { guiInterface = i0; }

    public static void setIsAndroid(boolean value) { isAndroidport = value; }
    public static boolean isAndroid() { return isAndroidport; }

    public static void setDeviceInfo(String DeviceName, String AndroidName, int AndroidAPI, int RAM) {
        deviceName = DeviceName;
        androidRelease = AndroidName;
        androidAPI = AndroidAPI;
        deviceRAM = RAM;
    }
    public static String getDeviceName() { return deviceName; }
    public static String getAndroidRelease() { return androidRelease; }
    public static int getAndroidAPILevel() { return androidAPI; }
    public static int getDeviceRAM() { return deviceRAM; }

    public static boolean isNetworkplay() { return networkplay; }
    public static void setNetworkplay(boolean value) { networkplay = value; }

    public static boolean hasPropertyConfig() { return propertyConfig; }
    public static void enablePropertyConfig(boolean value) { propertyConfig = value; }

    public static void setInterrupted(boolean value) { interrupted = value; }
    public static boolean isInterrupted() { return interrupted; }
}
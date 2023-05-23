package com.studiohartman.jamepad;

/**
 * Class defining the configuration of a {@link ControllerManager}.
 *
 * @author Benjamin Schulte
 */
public class Configuration {
    /**
     * The max number of controllers the ControllerManager should deal with
     */
    public int maxNumControllers = 4;

    /**
     * Use RawInput implementation instead of XInput on Windows, if applicable. Enable this if you
     * need to use more than four XInput controllers at once. Comes with drawbacks.
     */
    public boolean useRawInput = false;

    /**
     * Disable this to skip loading of the native library. Can be useful if an application wants
     * to use a loader other than {@link com.badlogic.gdx.utils.SharedLibraryLoader}.
     */
    public boolean loadNativeLibrary = true;

    /**
     * Disable this to return to legacy temporary file loading of database file.
     */
    public boolean loadDatabaseInMemory = true;

    /**
     * Enable Sony controller features like touchpad and motion sensors.
     * DualSense also offers adaptive trigger and haptic feedback support
     */
    public SonyControllerFeature useSonyControllerFeatures = SonyControllerFeature.NONE;

    public enum SonyControllerFeature {
        /**
         * Do not use any advanced Sony controller features
         */
        NONE(0),
        /**
         * Activate advanced DualSense features like touchpad and motion sensors
         */
        DUALSHOCK_FEATURES(1),

        /**
         * Activate advanced DualSense features like touchpad, motion sensors, adaptive triggers
         */
        DUALSENSE_FEATURES(2),

        /**
         * Activate advanced DualSense features like touchpad, motion sensors, adaptive triggers and haptic feedback
         */
        DUALSENSE_FEATURES_AND_HAPTICS(3);

        private final int value;
        private SonyControllerFeature(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }
}

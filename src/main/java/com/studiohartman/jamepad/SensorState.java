package com.studiohartman.jamepad;

/**
 * Contains information about the accelerometer and gyroscope data of the controller.
 */
public class SensorState {

    /*** accel data ***/

    private float accelX;

    private float accelY;

    private float accelZ;

    /*** gyro data ***/

    private float gyroX;

    private float gyroY;

    private float gyroZ;

    private long timestamp;

    SensorState() {
    }

    SensorState(float accelX, float accelY, float accelZ, float gyroX, float gyroY, float gyroZ, long timestamp) {
        this.accelX = accelX;
        this.accelY = accelY;
        this.accelZ = accelZ;
        this.gyroX = gyroX;
        this.gyroY = gyroY;
        this.gyroZ = gyroZ;
        this.timestamp = timestamp;
    }

    public float getAccelX() {
        return accelX;
    }

    public float getAccelY() {
        return accelY;
    }

    public float getAccelZ() {
        return accelZ;
    }

    public float getGyroX() {
        return gyroX;
    }

    public float getGyroY() {
        return gyroY;
    }

    public float getGyroZ() {
        return gyroZ;
    }

    public long getTimestamp() {
        return timestamp;
    }

    void update(float accelX, float accelY, float accelZ, float gyroX, float gyroY, float gyroZ, long timestamp) {
        this.accelX = accelX;
        this.accelY = accelY;
        this.accelZ = accelZ;
        this.gyroX = gyroX;
        this.gyroY = gyroY;
        this.gyroZ = gyroZ;
        this.timestamp = timestamp;
    }

    void update(SensorState sensorState) {
        this.accelX = sensorState.accelX;
        this.accelY = sensorState.accelY;
        this.accelZ = sensorState.accelZ;
        this.gyroX = sensorState.gyroX;
        this.gyroY = sensorState.gyroY;
        this.gyroZ = sensorState.gyroZ;
        this.timestamp = sensorState.timestamp;
    }
}

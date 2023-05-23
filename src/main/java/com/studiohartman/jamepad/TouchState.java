package com.studiohartman.jamepad;

/**
 * Contains information about the position of the finger on the touchpad of the controller.
 */
public class TouchState {
    private boolean state;

    private float x;

    private float y;

    TouchState() {
        this.state = false;
        this.x = 0;
        this.y = 0;
    }

    TouchState(boolean state, float x, float y) {
        this.state = state;
        this.x = x;
        this.y = y;
    }

    public boolean getState() {
        return state;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    void update(boolean state, float x, float y){
        this.state = state;
        this.x = x;
        this.y = y;
    }

    void update(TouchState touchState) {
        this.state = touchState.state;
        this.x = touchState.x;
        this.y = touchState.y;
    }
}

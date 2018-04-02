package com.design.demo.state_状态;

public class Context {


    public final static State CLOSE_STATE = new CloseState();
    public final static State OPEN_STATE = new OpenState();

    private State currentState;

    public Context(){
        CLOSE_STATE.setContext(this);
        OPEN_STATE.setContext(this);
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
//        this.currentState.setContext(this);
    }

    public void close(){
        currentState.close();
    }

    public void open(){
        currentState.open();
    }
}

package com.design.demo.responsibility_责任;

public abstract class Handle {

    private Handle nextHandle;

    public String handleRequest(String level){

        if(level.equals(getHandleLevel())){
            return response();
        }else{
            if(nextHandle!=null){
                return nextHandle.handleRequest(level);
            }else{
                return "no handle";
            }
        }
    }

    public void setNextHandler(Handle handler){
        nextHandle = handler;
    }

    public abstract String getHandleLevel();

    public abstract String response();
}

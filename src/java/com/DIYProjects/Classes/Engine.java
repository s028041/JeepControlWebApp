/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DIYProjects.Classes;

/**
 *
 * @author Mindaugas Liogys
 */
public class Engine {
    private EngineListener listener = null;
    
    public Engine()
    {

    }
    
    public Engine(EngineListener engineListener)
    {
        this.listener = engineListener;
    }
    
    public void Stop()
    {
        if (listener != null)
            listener.onStop();
    }
    
    public int SpeedDown() throws Exception
    {
        if (listener != null) {
            int speed = listener.onSpeedDown();
            return speed;
        }
        else
            throw new Exception("EngineListener error");
    }
    
    public int SpeedUp() throws Exception
    {
        if (listener != null) {
            int speed = listener.onSpeedUp();
            return speed;
        }
        else
            throw new Exception("EngineListener error");
    }
    
    public int SlowSpeed() throws Exception
    {
        if (listener != null) {
            int speed = listener.onSlowSpeed();
            return speed;
        }
        else
            throw new Exception("EngineListener error");
    }
    
    public int MediumSpeed() throws Exception
    {
        if (listener != null) {
            int speed = listener.onMediumSpeed();
            return speed;
        }
        else
            throw new Exception("EngineListener error");
    }
    
    public int FastSpeed() throws Exception
    {
        if (listener != null) {
            int speed = listener.onFastSpeed();
            return speed;
        }
        else
            throw new Exception("EngineListener error");
    }
    
    public int FullSpeed() throws Exception
    {
        if (listener != null) {
            int speed = listener.onFullSpeed();
            return speed;
        }
        else
            throw new Exception("EngineListener error");
    }
    
    public void Backward()
    {
        if (listener != null)
            listener.onBackwards();
    }
    
    public void Forward()
    {
        if (listener != null)
            listener.onForward();
    }
}


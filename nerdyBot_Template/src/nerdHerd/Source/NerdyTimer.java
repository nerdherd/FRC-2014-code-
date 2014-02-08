/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nerdHerd.Source;

import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author student
 */
public class NerdyTimer extends Timer {
    public NerdyTimer(double period){
        m_period = period;
    }
    
    public boolean hasPeriodPassed(){
        if(get() > m_period){
            reset();
            return true;
        }else{
            return false;
        }
    }
    
    private double m_period;
}

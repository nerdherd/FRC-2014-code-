/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;

import NerdHerd.*;
import NerdHerd.Source.NerdyBot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends NerdyBot {
    /**
public class RobotTemplate extends IterativeRobot
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    
    NerdyPIDRobot Robot;

    
    public void robotInit() {
        Robot = new NerdyPIDRobot();
        Robot.setHeadingTolerance(2);

    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    //        Robot.gyro.reset();
    //        while (isAutonomous()) {
    //        Robot.moveAndRotate(0.0, 1.0); // drive towards heading 0
    //        Timer.delay(0.004);
    //    }
    //    Robot.moveAndRotate(0.0, 0.0);
        //Robot.updateGyroValues();
        //double heading = Robot.getHeading();
        //System.out.print("\tHeading:\t" + heading);
        //double gyroRate = Robot.getRate();
        //System.out.print("\tgyroRate:\t" + gyroRate);
        //System.out.print("\tTime Period\t" + m_mainPeriodicTimer.getLastActualPeriod());
        Robot.calcDistanceTraveled();
        
        Robot.move(Robot.getPIDOutputLinear(1));
        
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {

        double angle = Robot.get360JoystickAngle();
        double linear =  (Robot.JoystickMain.getMagnitude()/Math.sqrt(2) ) * -Robot.sign(Robot.JoystickMain.getY());
        double twist = Robot.JoystickMain.getTwist();
        
        //Robot.moveAndRotate(angle, linear);
        Robot.calcDistanceTraveled();
        
        
        boolean turnMode = Robot.JoystickMain.getRawButton(5);
        if(turnMode){
            //Robot.rotate(twist);
            Robot.rotate(Robot.getPIDOutputAngular(angle));
        }else{
        //Robot.rotate(Robot.getPIDOutputAngular(angle));
        }
        boolean moveMode = Robot.JoystickMain.getRawButton(3);
        if(moveMode){
            Robot.move(-Robot.JoystickMain.getY());
        }
        boolean resetMode = Robot.JoystickMain.getRawButton(6);
        if(resetMode){
            Robot.gyro.reset();
            Robot.DistanceIntegrator.resetAccumulation();
            Robot.speedIntegrator.resetAccumulation();
            Robot.speedTraveling = 0;
            Robot.init();
        }
        boolean drive180 = Robot.JoystickMain.getRawButton(7);
        if(drive180){
            if(Robot.drive180Mode == true){
            Robot.drive180Mode = false;
            }else{
            Robot.drive180Mode = true;       
            }
            
        }
        updateStatus();
        
    }
    
    /**
     * This function is called periodically during test mode
     */
  
    
    public void updateStatus(){
        SmartDashboard.putDouble("Joystick Angle" , Robot.get360JoystickAngle());
        SmartDashboard.putDouble("Time Period" , m_mainPeriodicTimer.getLastActualPeriod());
        SmartDashboard.putDouble("Heading", Robot.getHeading());
        SmartDashboard.putDouble("Gyro Rate", Robot.getRate());
        SmartDashboard.putDouble("JoystickAngle is : \t", Robot.get360JoystickAngle());
        SmartDashboard.putDouble("JoystickY", -Robot.JoystickMain.getY());
        SmartDashboard.putDouble("JoystickX", -Robot.JoystickMain.getX());
        
        
        Robot.updateGyroValues();
        System.out.println("Heading: \t" + Robot.getHeading() + "\t GyroRate:"+Robot.getRate());
        System.out.println(m_mainPeriodicTimer.getLastActualPeriod());
        
    }
}

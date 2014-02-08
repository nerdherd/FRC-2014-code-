package edu.wpi.first.wpilibj.templates;

/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/




//import NerdHerd.Source.*;
import nerdHerd.Source.NerdyBot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;


/**
 * This is a test of the nerdyBot robotclass
 * This should run a modified version of the interative robot
 * This should run the teleopcontinous void all the time
 */
public class Testing extends NerdyBot{
    Joystick joyDriveLt, joyDriveRt;
    Victor   driveLtMain, driveLtSub, driveRtMain, driveRtSub;
    double driveLtValue, driveRtValue;
//    Filer logger;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
//        joyDriveLt  = new Joystick(1);
//        joyDriveRt  = new Joystick(2);
//        driveLtMain = new Victor(1);
//        driveLtSub  = new Victor(3);
//        driveRtMain = new Victor(2);
//        driveRtSub  = new Victor(4);
//        logger      = new Filer("log.txt");
//        logger.println("The first line");
//        logger.println("The second line");
//        logger.close();
//        System.out.println("robotInit");
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        System.out.println("autonomousPeriodic");
    }
    
    
    /**
     * This function is called each time operator control starts
     */
    public void teleopInit() {
//        driveLtValue = 0.0;
//        driveRtValue = 0.0;
    }

    
    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
//        System.out.println("teleopPeriodic");
//        driveLtValue = -joyDriveLt.getY();
//        driveRtValue = joyDriveRt.getY();
        
    }
       
    /**
     * This function is called repeatedly during teleop mode
     */
    public void teleopContinous(){
//        System.out.println("teleopContinous");
//        driveLtMain.set(driveLtValue);
//        driveLtSub.set(driveLtValue);
//        driveRtMain.set(driveRtValue);
//        driveRtSub.set(driveRtValue);
    }
}

package org.usfirst.frc.team5437.robot.commands;

import org.usfirst.frc.team5437.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveForTime extends Command {
	private double forward, rotation;

    public DriveForTime(double fwd, double rot, double time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.chassis);
    	forward = fwd;
    	rotation = rot;
    	setTimeout(time);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.chassis.Drive(forward, rotation);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassis.Drive(0.0, 0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

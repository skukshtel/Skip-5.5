package org.usfirst.frc3467.subsystems.Elevator.commands;

import org.usfirst.frc3467.commands.CommandBase;

/**
 *
 */
public class cangrabbersSetState extends CommandBase {

	private Boolean cmd;
	
	public cangrabbersSetState(Boolean engageCmd) {
        requires(cangrabbers);
        cmd = engageCmd;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if (cmd == true)
    		cangrabbers.engageCanGrabber();
    	else
    		cangrabbers.disengageCanGrabber();    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

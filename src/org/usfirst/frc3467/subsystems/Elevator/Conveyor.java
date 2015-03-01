package org.usfirst.frc3467.subsystems.Elevator;

import org.usfirst.frc3467.RobotMap;
import org.usfirst.frc3467.subsystems.Elevator.commands.conveyorDrive;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Conveyor extends Subsystem {

	// Constants for some useful speeds
	public static final double kIntakeFast = -0.6;
	public static final double kIntakePickup = -0.3;
	public static final double kIntakeHold = -0.25;
	public static final double kStop = 0;
	public static final double kEjectSlow = 0.25;
	public static final double kEjectFast = 0.5;

	public enum ConveyorState {kOff(0), kIntake(1), kDischarge(2);
		private int value;

		private ConveyorState(int value){
			this.value = value;
		}

		public int getValue(){
			return this.value;
		}
	};

	private static Conveyor instance;
	private VictorSP conveyorMotor;
	private VictorSP flippyThingMotor;

	public static Conveyor getInstance() {
		return instance;
	}
	
	public Conveyor() {
		instance = this;
		conveyorMotor = new VictorSP(RobotMap.conveyorVSP);
		flippyThingMotor = new VictorSP(RobotMap.flippyThingMotor);
	}
	
	protected void initDefaultCommand() {
		this.setDefaultCommand(new conveyorDrive());
	}
	
	public void driveManual(double speed) {
		conveyorMotor.set(speed);
	}
	
	public void driveFlippyThing(double speed) {
		flippyThingMotor.set(speed);
	}
		
	
}

// RobotBuilder Version: 3.1
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package frc.robot.subsystems;


import frc.robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class my_drivretrain extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private WPI_TalonSRX talonSRX1;
private WPI_TalonSRX talonSRX2;
private WPI_TalonSRX talonSRX3;
private SpeedControllerGroup my_Right_SCG;
private WPI_TalonSRX talonSRX4;
private WPI_TalonSRX talonSRX5;
private WPI_TalonSRX talonSRX6;
private SpeedControllerGroup my_Left_SCG;
private Encoder quadratureEncoder1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private DifferentialDrive differentialDrive1;
    /**
    *
    */
    public my_drivretrain() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
talonSRX1 = new WPI_TalonSRX(0);
 
 

talonSRX2 = new WPI_TalonSRX(1);
 
 

talonSRX3 = new WPI_TalonSRX(2);
 
 

SpeedControllerGroup my_Right_SCG = new SpeedControllerGroup(talonSRX1, talonSRX3  );
 addChild("My_Right_SCG",my_Right_SCG);
 

talonSRX4 = new WPI_TalonSRX(13);
 
 

talonSRX5 = new WPI_TalonSRX(14);
 
 

talonSRX6 = new WPI_TalonSRX(15);
 
 

SpeedControllerGroup my_Left_SCG = new SpeedControllerGroup(talonSRX4, talonSRX5 , talonSRX6 );
 addChild("My_Left_SCG",my_Left_SCG);
 

quadratureEncoder1 = new Encoder(0, 1, false, EncodingType.k4X);
 addChild("Quadrature Encoder 1",quadratureEncoder1);
 quadratureEncoder1.setDistancePerPulse(0.012);
quadratureEncoder1.setPIDSourceType(PIDSourceType.kRate);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

    differentialDrive1 = new DifferentialDrive(my_Left_SCG, my_Right_SCG);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void My_Drive_Archade(double xSpeed, double zRotation) {
        differentialDrive1.arcadeDrive(xSpeed, zRotation);

    }

    public double My_Get_Encoder(){
        return quadratureEncoder1.getDistance();

    }

	public void My_Reset_Encoder() {
        quadratureEncoder1.reset();
	}
}


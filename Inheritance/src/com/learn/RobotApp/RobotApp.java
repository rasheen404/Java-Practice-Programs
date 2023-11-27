package com.learn.RobotApp;

public class RobotApp {

	public static void main(String[] args) {
		ChefRobot cRobot = new ChefRobot();
		cRobot.talk();
		cRobot.walk();
		cRobot.Charge();
		cRobot.Cook();
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------");
		
		DoctorRobot dRobot=new DoctorRobot();
		dRobot.talk();
		dRobot.walk();
		dRobot.Charge();
		dRobot.Surgery();
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------");
		
		
		TeacherRobot tRobot=new TeacherRobot();
		tRobot.talk();
		tRobot.walk();
		tRobot.Charge();
		tRobot.Teach();
	}

}

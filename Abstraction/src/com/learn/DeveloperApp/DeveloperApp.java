package com.learn.DeveloperApp;

public class DeveloperApp {

	public static void doActivity(Developer ref) {
			ref.attendMeeting();
			ref.doProject();
			if(ref instanceof PythonDeveloper)
			{
				((PythonDeveloper)(ref)).learnPython();
			}
			else if(ref instanceof JavaDeveloper)
			{
				((JavaDeveloper)(ref)).learnJava();
			}
	}
	public static void main(String[] args) {
		PythonDeveloper pythonDeveloper = new PythonDeveloper();
		JavaDeveloper javaDeveloper = new JavaDeveloper();
		doActivity(javaDeveloper);
		doActivity(pythonDeveloper);
	}
}

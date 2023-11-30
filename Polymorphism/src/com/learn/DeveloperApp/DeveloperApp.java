package com.learn.DeveloperApp;

public class DeveloperApp {
	public static void main(String[] args) {

		Developer developer;
		BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
		developer = backEndDeveloper;
		developer.AttendMeeting();
		developer.Project();
		((BackEndDeveloper) (developer)).LearnJava();

		DataBaseDeveloper dataBaseDeveloper = new DataBaseDeveloper();
		developer = dataBaseDeveloper;
		developer.AttendMeeting();
		developer.Project();
		((DataBaseDeveloper) (developer)).LearnSql();

		WebDeveloper webDeveloper = new WebDeveloper();
		developer = webDeveloper;
		developer.AttendMeeting();
		developer.Project();
		((WebDeveloper) (developer)).LearnHtml();

	}
}

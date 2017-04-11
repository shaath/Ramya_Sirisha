
Feature: Login and Logout Functionalities
	Scenario: Login
		Given User launches the browser and launching application
		When User enters username and password
		And clicks on login
		Then displays welcome admin message
		
	Scenario: Logout
		When User clicks on Welcome admin link
		And also Clicks on logout
		Then Login page displayed	
		
		
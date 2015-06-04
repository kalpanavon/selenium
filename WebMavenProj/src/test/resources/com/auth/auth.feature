Feature:FA registration to POLE service
	In order to log in to services
	As Financial Adviser
	I should register my details to service
	
	Scenario:Register with a valid details
		Given FA wants to register details
		When he enters a his name Adviser1 and valid email address kalpana.vonteri@gmail.com
		Then FA should get mail with password
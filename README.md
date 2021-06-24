# AutomationForMobile
Automation Framework using Appium

# Introduction 

The Automation - End to End Tests Framework for the mobile android will test the app from an user point of view.
Test Automation Framework has a lot of benefits including an increase in efficiency, speed, and test accuracy.

# Getting Started

TODO: Guide users through getting the code up and running on your own system.

Installation and Build process:
	- clone the project from the repository;
	- before doing anything with the project, you will need Appium, AndroidStudio and IntelliJ, please check the official sites on how to install them;
	- please follow this steps to set up the project and run the tests:
		1. Start the Appium server;
		2. Start AndroidStudio and set up the emulator: 
			Click on Tools -> AWD Manager -> Create Virtual Device -> Select Pixel3a XL an API level 29;
		3. Run the Emulator from Android Studio, and close the current app that is running;
		4. To see if the emulator is runnig you will need to set a path to your adb installed on your computer, please check the official site on 
			how to do this;
			-after you have set the path, go to your Command Prompt and type: "adb devices" and it should show the name of the emulator, like
         		"emulator-5554";
		5. The project uses jdk version 15; open the AutomationTests project using the "pom" and and click open as project; click on maven and 
				select "clean install" to configure and build the project;
		6. After the project was successfully build, in the "target" package, generate by maven, go to surefire-reports and you will have several 
			reports, e.g. "emailable-report.html"-> open it with chrome or another browser type, and you will see the tests that have failed or
			passed;
  
  # Contribute
  
  Test Automation Framework is one of the widely used tools in organizations for testing the applications based on different programming language and platforms. The testing framework saves a lot of effort and time to test the application on a frequent basis. To select the test automation framework, the individual has to take care of certain things like it should be application independent. It must be easy to expand and maintained. Which framework is quickest and easiest to implement for the application and the resource available for that expertise.

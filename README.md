# BPMN-RPA
Integration between camunda and UiPath

Prerequisites
1. UiPath Studio
2. camunda-bpm-tomcat-7.11.0
3. camunda-modeler-3.3.4-win-x64
4. JAVA

First Need to publish the UiPath Project to orchestrator then do the below setting in application property file

These Above things are Need to be installed on machine.

Application Properties :

uipath.tenancy.NAME = `<Your Tenancy Name>`

uipath.tenancy.usernameOrEmail = `<your userNameOrEmail>`

uipath.tenancy.password = `<Password for orchestrator>`

uipath.filter.ProcessByName = `ProcessKey eq '<process name which created in orchestrator>'`

uipath.filter.RobotByName = `Name eq '<robot name which created in orchestrator and connected to your machine>'`

provide your input argument as property like :
uipath.input.argument.in_MessageName = `<Message_name_which_set_For_Recieve_TASK>`

uipath.input.argument.in_BusinessKey = `<Business_key> or put X it will take automatically from BPMN Process in JAVA Class`

uipath.input.argument.in_currentLocation = `<CITY you want to check weather>`

# HOW TO RUN:

Publish RPA project to Orchestartor

Create Create a Process and assign Robot for that.

Made the changes in Application properties which mentioned in above.

Maven Build to camunda-JAVA project

Copy war to camunda-bpm-tomcat-7.11.0\server\apache-tomcat-9.0.19\webapps

execute camunda-bpm-tomcat-7.11.0\start-camunda.bat 

Go to Opened Browser Window of camunda and Start Process

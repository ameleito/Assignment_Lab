<h1>Purpuse</h1>

This repository contains the projects and tools to resolve the assignment homework for Advanced Camel Development with Red Hat Fuse course, 
with a little variation and its have all projects for Spring-boot in the next sections we will describe how to use them and make deploy,
this is the secound part.

<h1>Request</h1>

For this work we need a broker installed locally and running with port 61616.

The other Requirement is have a postman installed to use the request you will find in the file AssigmentCamel.json

<h1>Step by Step</h1>

<h2>1. cloning</h2>

Obviously the first option here will be get or clone our repo for this option we need to execute the next command.

	git clone https://github.com/ameleito/Assignment_Lab.git

<h2>2. Import profile </h2>

To enable the projects we will run the next command in console insede each project.

2.1 Run Inbound Project.

		<REPOSITORY_HOME>/inbound
		mvn spring-boot:run

2.2 Run Xlate Project:

		<REPOSITORY_HOME>/xlate
		mvn spring-boot:run

2.2 Run outbound Project:

		<REPOSITORY_HOME>/outbound
		mvn spring-boot:run

<h2>5. Runing the Postman Test </h2>

	First you need to import the file AssignmentCamel-SpringBoot.json inside Postman.

	Finally you can run the request PostSendData.

<h2>6. Another Works</h2>

For this course we generated the same routes but for Spring-boot, this routes are available in the next repository
https://github.com/ameleito/Assignment_Lab.git, you can check them and make the comments about it.

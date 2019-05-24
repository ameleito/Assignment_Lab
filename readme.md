<h1>Purpuse</h1>
This repository contains the projects and tools to resolve the assignment homework for Advanced Camel Development with Red Hat Fuse course.
With a little variation and it's to have all projects for Spring-boot, in the sections below we will describe how to use them and make deploy.
this is the second part.

<h1>Request</h1>

For this work we need a broker installed locally and running with the port '61616'.

The other Requirement is to have a postman installed to use the request that you will find in the file AssigmentCamel.Json

<h1>Step by Step</h1>

<h2>1. Cloning</h2>

Obviously, the first step is going to get or clone our repo for this option we need to execute the next command.

    git clone https://github.com/ameleito/Assignment_Lab.git

<h2>2. Import profile </h2>

To enable the projects we will run the next command in the console inside each project.

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

   First, you need to import the file AssignmentCamel-SpringBoot.json into the Postman.

   Finally, you can run the request PostSendData.

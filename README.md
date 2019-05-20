<h1>Purpuse</h1>

This project contains the assignment for the course Advanced Camel Development with  Red Hat Fuse resolve and of course we describe
how you must use it, at first part you will have the description about content and how you can deploy them cause we have a couple of projects.

<h2>Request</h2>

As a firts these projects are development to have a complete route functional, we need a broker running like a server in the same machine where we test the 
conponents, this cause we move all the routes to a Spring-boot Context, we will describe how to start each project but of course we need that request about broker to 
get the correct working of the route, in another project we have the option for karaf this is the route <a href="https://github.com/ameleito/Assignment_Lab_Karaf.git">project for karaf</a>. now we will proceded with the description.

inbound project: Contain the route publish a service and put the inside data in a queue call queue.person.deim.in
xlate project: Read the data from the queue queue.person.deim.in and this one data pass the validation put the same in a queue called queue.person.nextgate.out
outbound project: Take the data from queue.person.nextgate.out and send the request to a server called Nextgate.

process to run this routes.

inbount project: in command console start the project with the maven command mvn spring-boot:run
xlate project: in command console start the project with the maven command mvn spring-boot:run
outbound project: in command console start the project with the maven command mvn spring-boot:run

like we say previously you need a broker running to test these projects.


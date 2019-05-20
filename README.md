#Business Scenario

This project facilitates synchronization of master patient records across different healthcare providers. It is important to have consistent patient information across these multiple providers so that patients may receive consistent care. For that to occur, their personal and medical information needs to be shared. Updates to the patient record also need to flow across the providers to maintain accuracy and currency.
Technical goals to accomplish the above:

    Build a RESTful CXF service that receives the patient record and validates it.

    Publish the XML to a queue and send an acknowledgement back to the client (Done transformer in the use case document).

    Receive the message from the messaging system and invoke the backend web service. The Nextgate web service will be provided for testing. Respond to the client using the Done transformer.

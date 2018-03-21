# Actuator

This project shows how Actuator works.

Once you've set up the Actuator module, requesting the default page (which doesn't exist) using a tool away from the browser (e.g. curl), the server will return an error message in a json-like format.

Also many informative endpoints will get generated for you, for example try to type *http://localhost:8080/actuator/health*.


On peut aussi changer certaines informations globales, voir le fichier **application.properties**

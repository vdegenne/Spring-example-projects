# Actuator

This project shows how Actuator works.

we use the `spring-boot-starter-actuator` dependency to use the `spring-boot-actuator` module.


Once we've set up the Spring Boot Actuator dependency, if we request the root page (e.g. "/") which doesn't exist using a tool different from the browser (e.g. curl), the server will return an error message in a json-like format.


Par défaut, grand nombre des endpoints sont désactivés pour des raisons de sécurité. Voir le fichier **application.properties** pour plus d'informations sur comment les activer.

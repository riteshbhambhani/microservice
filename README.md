# microservice
Demo : Spring Boot and Microservices

Edge Service is Pateint and it calls medicine and Documents
Medicines and Documents can be called on seperate URI 
Documents: http://localhost:9010/document/629528/all where 629528 is PatientID
Medicines: http://localhost:9011/medicines/629528/all
Patient: http://<Patient-Host>:9009/demo/patient/629528/data
  
Uses Eureka for Service Registry.
Used H2 DB for demo. Spring boot uses SQL to load sample data on start up. 

Future Enhancements:
1. Zuul as Gateway
2. Implementing Spring Security 
3. ELK for log analysis 

  

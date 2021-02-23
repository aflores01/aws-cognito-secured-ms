# AWS COGNITO SECURED MS
A simple API secured with AWS Cognito OAuth2 as resource server

##Requirements
 - AWS Account to setup appClient, scopes, resource server etc.

##Features

>This spring boot application comes with a simple API which composes of one endpoint
> and a service to do business logic.
 
###What you need:
- AWS User Pool
- Client ID, secret & region
- Your /oauth/token URL
- A resource server defined for your scopes inside management console in AWS

##Setting up you environment variables

> spring_security_oauth2_resourceserver_jwt_issuer_uri=https://cognito-idp.<aws-region>.amazonaws.com/<cognito-pool-id>
> server_port:Your desired server port

##Make the magic

When your resource server its running and up you can generate your access_token and authenticate each call to 
your API with the defined scopes in AWS console management. Spring Boot automatically manages the permissions through the 
defined scopes, and you cannot access a resource that's not defined in the Resource Server.

##I need to disable the security in some resources of my application

Check de SecurityConfiguration, as we are using Spring Security to manage permissions, you can disable the authentication
for desired resources.

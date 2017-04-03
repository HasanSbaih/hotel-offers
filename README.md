# hotel-offers

this project conworks as a simple api gateway , where it's consumes a public api from https://offersvc.expedia.com/offers/v2/getOffers
to provide an optimal API for client web app to consume .
Nothing fance used here to accomplish the task , it's only a Spring rest template to consume the api,
and I have used Spring boot to present the wanted data as a rest api .

#Building from Source

call 
$ ./mvn clean install
to build the binaries .

Java 1.8 is needed to compile the binaries.

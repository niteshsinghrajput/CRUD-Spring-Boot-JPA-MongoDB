## MyRetailApp


1. clone the git repository from following url
```
  $ git clone https://github.com/niteshsinghrajput/MyRetailApp.git
```
2. Move to cb-vRA-assets-intg folder
```
  $ cd MyRetailApp
```
3. Set Environment variable for JAVA_HOME, MAVEN_HOME as (In Linux/Mac)
```
  $ export JAVA_HOME=<Path of Java Installation Director>
  $ export MAVEN_HOME=<Path of Maven Installation Directory>
  $ export PATH=$JAVA_HOME/bin;$MAVEN_HOME/bin
```

4. Set Environment Variable in windows as 
```
  > set JAVA_HOME=<Path of Java Installation Director>
  > set MAVEN_HOME=<Path of Maven Installation Directory>
  > set PATH=$JAVA_HOME/bin;$MAVEN_HOME/bin
```
5. Install MongoDB and start MongoDB 

6. Create a database named as `store` in mongodb

7. Create a database user in mongodb

8. Set following properties in application.properties (src/main/resources/application.properties) 
```
spring.data.mongodb.uri=mongodb://<db user>:<db password>@<dbhost>:<db port>/<db name>
```
9. Run following command to build 
```
  $ mvn clean install
```
10. Run following command to run application 
```
  $ java -jar target/myRetail-0.0.1-SNAPSHOT.jar
```
11. There are following endpoint available :
```
  GET : http://localhost:8080/productservice/product/<id>
```
  Response :

  {
    "id": 13860428,
    "name": "The Big Lebowski (Blu-ray)",
    "currentPrice": {
        "price": 1350.49,
        "currencyCode": "INR"
    	}
  }
```
  PUT : http://localhost:8080/productservice/product/<id>
```
  Request Payload :
 ```
  {
    "id": 13860428,
    "name": "The Big Lebowski (Blu-ray)",
    "currentPrice": {
        "price": 1350.49,
        "currencyCode": "INR"
    	}
  }
```
  Response:
```  
  {
    "id": 13860428,
    "name": "The Big Lebowski (Blu-ray)",
    "currentPrice": {
        "price": 1350.49,
        "currencyCode": "INR"
    	}
  }
```






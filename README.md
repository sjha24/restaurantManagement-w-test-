# restaurantManagement
[![Java](https://img.shields.io/badge/Java>=8.0-blue.svg)](https://docs.spring.io/spring-boot/docs/0.5.0.M6/api/org/springframework/boot/SpringApplication.html)
[![maven](https://img.shields.io/badge/maven->=3.0.5-green.svg)](https://www.npmjs.com/package/npm/v/5.5.0)
[![springBoot](https://img.shields.io/badge/SpringBoot->=3.0.6-blue.svg)](https://nodejs.org/en/blog/release/v9.3.0)
>This project is a Managing restaurant data built using Spring Boot with Java.

[Homepage]();

## Framework used
 * Spring Boot
## Languaged Uesd
 * Java
## Data Model
>TThe Restaurant data model is defined in the Restaurant class, which has the following attributes:
```
restaurantId : unique identifier for each restaurant
Name : name of the restaurant
Address : address of the restaurant
Number : Phone number of the restaurant
specialty : specialty of the restaurant
totalStaff : staff in the restaurant
```
## Data Flow
```
1. User send as a request to the application throgh the endpoints
2. the api recived request and sends it to the appropriate controll method
3. the controller method makes a call to the method in service class.
4. he controller method returns a response to the API
5. The API sends the response back to the user
```
## Function Used 

* GetMaping/AllRestaurant
```
This endpoint makes a call to method in RestaurantService class which retrieves data of all restaurants from database. This data is sent to controller which is then sent through the API to client.
```
* GetMaping/getRestaurantById
```
This endpoint returns data of specific restaurant based on restaurantId through API.
```
*PostMaping/addNewRestaurant
```
This endpoint makes a call to method in RestaurantService class which is connected to database. In database we add a new restaurant given through API.
```
*PutMapping/restaurantId/{restaurantId}
```
This endpoint makes a call to method in RestaurantService class which is connected to database. In database we update a Restaurant by restaurantid given through API.
```
*DeleteMapping/restaurantId/{restaurantId}
```
This endpoint makes a call to method in RestaurantService class which is connected to database. In database we delete a restaurant by restaurantId given through API.
```
## Data Structure Used
* HashMap
```
We have used HashMap data structure as a database to get, add and update Users data in database .
```

## Project Summary
```
This project is a RESTful API built using Spring Boot. Its purpose is to manage restaurant data by providing CRUD (Create, Read, Update, Delete) operations. The API can be used to get a restaurant by ID, get all restaurants, add a new restaurant, update a restaurant's specialty, and delete a restaurant from the database.
```
## Author

Saurav Kumar

* twiter : [@saurav](https://twitter.com/Sauravjha24)
* Github : [@sjha](https://github.com/sjha24)

## Contributing

Contributions , issues and features requestes are welcome !

Feel free to check issues page

## Show your support

Give a rating if this project help you

## License

Copyright : 2023 [Saurav Kumar]()
This project is [GeekSter](https://www.geekster.in/) license

# Billing

## Requirements
- Java 11
- Postgres

## Setup env
- run `mvn clean validate compile`
- run `mvn spring-boot:run`

## to test manually
- add users using the post apis:
`localhost:8080/customers`
``localhost:8080/affiliates``
``localhost:8080/employees``

- - example:
`Post: http://localhost:8080/employees` with body `{
                                                   	"name": "khaled emp",
                                                   	"email": "email@gmail.com"
                                                   }`
                                                   
- add produt using api in same way
- - example:
`Post: http://localhost:8080/products` with body `{
                                                  	"name": "p 4",
                                                  	"category": "OTHER",
                                                  	"price": 420
                                                  }`
 Note that category should by OTHER or GROCERIES
 
- create bill by sending user and products and you will get the amount in response
- - example:
`POST: http://localhost:8080/bills` with body: `{
                                                	"user": {"id": 1},
                                                	"products": [{"id": 2}, {"id": 3}, {"id": 4}]
                                                }`
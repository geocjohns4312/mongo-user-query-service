# mongo-spring-graphql-service
Access the app at this endpoint on web browser - http://localhost:8081/graphiql

User Query:
```
query {
  users {
    id
    name
    email
    age
  }
}
```

With Postman:

Endpoint: http://localhost:8081/graphql
```
{
  "query": "query { users { id name email age } }"
}
```

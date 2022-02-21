# spring-boot-assignment

<h2>Required Api to fetch basic informations </h2>

http://localhost:8080/get/details

Sample data is used here for assignment but in future it can be fetched from database.

sample code snippet

Controller.java

```java
@RestController
@RequestMapping("/get")
public class DetailsInfo {

    @Autowired
    DetailService service;

    @GetMapping("/details")
    public List<Data>getDetails(){
        return service.getAllData();
    }

}
```

service.java

```java
@Service
public class DetailService 
{
    List<Data> getAllData(){
        List<Data> obj = Arrays.asList(
            new Data(1,"sanket puhan","sanketpuhan7@gmail.com","Quantiphi"),
            new Data(2,"sambit pradhan","sambit@gmail.com","Delliot")
        );
        return obj;
    }
}
```

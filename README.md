:house:    <font color='Blue'>User management System </font>
### Framework uses
--------------
- spring boot
---------



### **use of dependency**
-----
- <dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-web</artifactId>
    <version>6.0.8</version>
</dependency>

- <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <version>3.0.5</version>
</dependency>



### **packages and class**
----
- entity 
  - Student 

- rest
   - StudentController

- service
   - StudentService
### **usages**
- **entity**
  - created entity package inside entity package i created  Student class  inside  student class initialize  all atribut of Assignment  like userId,name,userName,address,phone.

  - after initializing all attribute as a private  created a constuctor to initialized  object.

  - than created getter and setter Getter and Setter in Java are methods used to access and set the values of an object’s attributes, respectively. They are also referred to as accessor methods and mutator methods.

- **service**

   - Spring boot service component is defined as a class file that includes the @Service annotation and allows developers to add business functionalities. The annotation is used with the classes that provide these business functionalities.

   - after created  service package inside service package i created StudentService class  than , i used  static ArrayList data Structures and set default value using static block . than wrote all logic for  get all student  ,put ,delete,post,searching using  path varible  all mentioned in assignment.

- **rest**

  -  Spring RestController annotation is used to create RESTful web services using Spring MVC. Spring RestController takes care of mapping request data to the defined request handler method. Once response body is generated from the handler method, it converts it to JSON  response.

### **Run tests**

------

⭕ postman 

:globe_with_meridians: chrome browser



### **Data structure used**

-----

 ArrayList

  :point_down: **Summary**
*****
user_mangement project is Basically based on crud opertion of spring boot  where user can use api and  get user, post user put user, delete user.i created this project  learnt about Annotation like @Service Annotation @Aurowired Annotation, learnt about create api  how to create endPoint how to set @pathvariable. 

### **Show your Support** 
****
:star: Thankyou 

****








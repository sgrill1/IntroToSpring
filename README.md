# IntroToSpring

A first web development project using the Spring framework

## Key Features

### Annotations

* @EnableAutoConfigurtaion:
* @ComponentScan:
* @Controller: Alerts Spring to scan this package when running the @ComponentScan annotation is used.
* @Request Mapping: Requests a URI, the subsequent method then returns the string associated to the name of the template.
* @ResponseBody: Used when the return statement is not the string associated to the name of the template.
* @Autowired: Tells Spring to construct and assign an object to an instance field as soon as it's needed.
* @Component:
### Statics: 

* A static is anything that does not change on a live version of the site. For example the CSS, the javascript or any images.

### XML compliance:

* In IntelliJ, the HTML files must be XML compliant meaning all tags must be opened and closed, or self-closing.

### ThymeLeaf:

* ThymeLeaf is a _server side_ Java template engine used to insert dynamic (non-static) data into an HTML (https://www.thymeleaf.org/documentation.html)

#### Dynamic vs. Static in ThymeLeaf


* Static:

``` <img th:src="@{/gifs/compiler-bot.gif}" alt="gif" /> ```


* Dynamic:

``` <img th:src="@{'/gifs/' + ${gif.name} + '.gif'}" alt="gif" /> ```

In the static case the compiler-bot gif has been hardcoded into the source path. The dynamic case is an example of a standard expression in Thymeleaf.
It includes string literals in single quotes here, as well as a variable expression that starts with a dollar sign, and is enclosed in curly braces. This syntax is used to access objects that we've
added to the model map from our controller.

**Note:** `${gif.name}` does not directly access the private member variable , it actually looks for the standard naming convention used for getters.

### POJO's

* Plain Old Java Objects are used to model the content of the application.

### Dependency Injection

In this project a dependency injection is first used when creating the GifRepository class that stores the information about the indiviual Gifs in memory (Note: professional applications would read information from a database). When the GifRepository class is added as a field variable we need to assign it something, otherwise it will be null. We could do this using a constructor. A shorter way is to use the @Autowired annotation that comes with spring. This tells Spring to construct and
assign a GifRepository object to this instance field as soon as it's needed. In order for Spring to know to do this, we add an @Component annotation to the GifController.

Now, Spring will pick this up during the initial component scan as a result of the app config being loaded. When the GIF controller needs a GifRepository class, Spring creates one or uses one that's already been created. Creation of objects at runtime (using the Autowired annotation) is known as an injection. Without explicitly writing code to construct and assign objects is called dependency injection.



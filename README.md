# SpringBootWebApps
This is a very basic REST (REpresentational State Transfer) API (HTTP methods: GET) built using Spring Boot (SB) Java framework.

Spring Boot (SB) offers a quick way to build applications.
It looks at classpath & at the beans that Developer configured, makes reasonable assumptions about what we are missing & adds those items.

Advantage:
Developers can focus more on Bz features & less on Infrastructure


Is Spring MVC on classpath?
There are specific beans that we almost always need & spring boot adds them automatically.
Eg: Spring MVC application needs a Servlet Container so SB automatically configures embedded Tomcat ( if no specific container like Jetty is explicitly provided by Dev)
Is Thymeleaf on the classpath (cp). If yes, then there are few beans that must be added to our application context which are added by SB.

Application Context (Interface)
Application Context is Spring's advanced container.Just like BeanFactory interface, it can 

a. load bean definitions 

b. wire beans together 

c. dispense beans upon request 

Application Context includes all functionalities of the BeanFactory & is kind of superset for BeanFactory. BeanFactory can still be used for lightweight applications like Mobile devices or applet-based applications. 
.
Most commonly used Application Context implementations are 

1.FileSystemXMLApplicationContext : This Container loads definitions of the beans from the provided XML bean Configuration file (full path to be provided) to the constructor. 

2.ClassPathXMLApplicationContext: This Container loads definitions of the beans from an XML file (Container picks the file from ClassPath) 

3.WebXMLApplicationContext: This Container loads the XML file itself which has all Bean definitions. 

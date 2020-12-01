
**Caitlin Cabrera <br>
CSCI 656 Software Design and Implementation <br>
Dr. Hashemi <br>
Fall 2020**
<br>
Test class: App.java
<br>
This project uses Java and Maven 
<br>
<br>
**To run Maven project:** 
<br>
mvn package
<br>
java -jar target/cs656-0.0.1-SNAPSHOT.jar
<br>
<br>
**To run API:** 
<br>
cd jersey-service
<br>
mvn clean compile 
<br>
mvn exec:java
<br>
<br>
**Software Architecture Document**
<br>
<br>
    1.1 Purpose
        This README provides the architectural scope and other details related to this project. 
<br>
    1.2 Scope
        This Software Architecture Document provides an architectural overview of this project, which is the design and implementation of system architecture and a service-based application inspired by the application, PostMates, for Dr. Hashemi's CSIS 656, Software Design and Implementation course. 
<br>
    1.3 References 
        Utilized the following tutorial as well as the java API documentation https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/griz_jersey_intro/Grizzly-Jersey-Intro.html
<br>
    
    1.4 Use-Case View and Architecturally-Significant Use Cases
<br>
    The PostMates use cases are shown below:
    <br>
    ![image](https://drive.google.com/uc?export=view&id=15LYQWZV88BEFL9XjnsobHx2tcxY_p1Cz)
    <br>

<br>

![image](https://drive.google.com/uc?export=view&id=1hzG1qKrGha0it2P2MLZ8KWn5wjAMsc-S)
<br>
<br>
![image](https://drive.google.com/uc?export=view&id=1teW5FMuSvJHS1__Lg8PhrMnql9b2m-5h)
<br>
<br>
![image](https://drive.google.com/uc?export=view&id=1RWb7JtudlyQzKLZil37Vzlnr-3fNPZEX)
<br>
<br>
![image](https://drive.google.com/uc?export=view&id=1VwkJB3A1el_O6WU99g38s-kAdQtYtYed)
<br>
<br>
![image](https://drive.google.com/uc?export=view&id=10iLtoMaCtImM0HtxQmDERqbhzn313ETN)
<br>
<br>
![image](https://drive.google.com/uc?export=view&id=15THd8-rEjHPjScjA8LtCImjyLzx1huOV)
<br>
<br>
<br>
    1.5 Logical View and Architecturally-Significant UML
    <br>
    The logical view of this system has 2 main packages: business and model. There are interfaces implemented in each of these packages as well. The business classes contain logic that relates to object creation and manipulation for each actor, as well as interfaces related to finance services. The model classes contain POJOs, and logic related to these. 
    <br>

![image](https://drive.google.com/uc?export=view&id=16vI603xK_QtH_eRK8CgVmKO5CdEt1oVX)
<br>
<br>
<br>
![alt text](https://www.bestdesigns.co/uploads/inspiration_images/9200/990__1531237314_64_Postmates%20Top%20Logo%20Design_33c6a97d3177.jpeg)



![alt text](https://www.theindianwire.com/wp-content/uploads/2018/06/java.jpg)

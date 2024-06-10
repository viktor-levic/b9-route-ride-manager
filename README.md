# 🚌 Service for ordering bus tickets 🚌
<h1 align="center">
<img src="assets/bus-header.png" alt="Header" width="340"> <br>
</h1>
<details align="center">
  <summary> <h4> Table Content </h4>  </summary>
    <p align="center" style="color: #fa464f">
        • <a href="#-Description-" style="color: #a8b6c5">Description</a>
        • <a href="#-Features-of-the-program-" style="color: #a8b6c5">Features of the program</a> <br>
        • <a href="#-Project-structure-" style="color: #a8b6c5">Project Structure</a>
        • <a href="#-Technologies-" style="color: #a8b6c5">Technologies</a>
        • <a href="#-How-to-run-application-" style="color: #a8b6c5">How to run the application</a>
    </p>
</details>

# My contacts
[![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/viktor-levitskyi-391447266/)


---

## 📕 Description 📕
This project is a full-stack application, written in Java, Spring, JS and Vue.js, prepared for using as a service of ordering bus tickets online. 
It implements the most necessary functions for such an application:

#### There are 2 general roles:

  • User (for purchasing tickets)

  • Admin (for managing the system)
  
  • We can registrate new users and admins, and also to save them in the database

1. As a user we have an opportunity to order a ticket, choosing a route, departure/arrival date, number of baggage. After ordering a ticket we need to name ourselves, choose an amount of baggage, put in our contacts and to choose payment method (with card or Google Pay).

#### There are such pages as: login page, home page, my tickets page, ordering page.

![image](https://github.com/viktor-levic/b9-route-ride-manager/assets/133751188/6d9b6abd-4c37-472b-af6d-6c01721bf807)   
------
![image](https://github.com/viktor-levic/b9-route-ride-manager/assets/133751188/85944bd1-c5b4-4cf6-89f9-580b7f4afbcd)
------
![image](https://github.com/viktor-levic/b9-route-ride-manager/assets/133751188/1a96b3ed-7a61-48f7-8e18-bf7bb0f26651)
------
![image](https://github.com/viktor-levic/b9-route-ride-manager/assets/133751188/822edef5-3c95-4f95-b544-c31934dc8546)
------
![image](https://github.com/viktor-levic/b9-route-ride-manager/assets/133751188/e1bc2269-0616-4491-851d-af6ca719e52b)
------

2. As an admin we have an opportunity to create new users, new cities and new routes for further purchasing them with client.
It means as the admin we can control everything.

#### There are such pages as: login page, home page, my tickets page, ordering page and managenent page (where we can control everything).

![image](https://github.com/viktor-levic/b9-route-ride-manager/assets/133751188/f7528fb0-f496-483a-b999-b7ca9c6313b2)
------


 
## ⚡ Features of the program ⚡

| Roles      |                    Feature                    | Endpoints                             |
|------------|:---------------------------------------------:|---------------------------------------|
| Admin/User |               Get login page                  | GET: `/` or `/login`                  |
| Admin/User |               Get search page                 | GET: `/search`                        |
| Admin/User |               Get payment                     | GET: `/payment`                       |
| Admin/User |               Get my tickets                  | GET: `/my-tickets`                    |
| Admin      |               Get city                        | GET: `/city`                          |
| Admin      |               Add city                        | POST: `/city`                         |
| Admin      |               Get route                       | GET: `/route/{route_id}`              |
| Admin      |               Add route                       | Add: `/route/{route_id}`              |
| Admin      |               Get ticket                      | GET: `/ticket`                        |
| Admin      |               Add ticket                      | POST: `/ticket`                       |


Looking at the table you can understand what resource the `user` or `admin` has access to.

## 🧱 Project structure 🧱
Project structure has such structure:

![image](https://github.com/viktor-levic/b9-route-ride-manager/assets/133751188/187ec77a-db5f-4c46-9494-9918e7132b93)
---

### DB structure
![image](https://github.com/viktor-levic/b9-route-ride-manager/assets/133751188/cdc0bf5c-5cc4-4bb8-8cb3-5e0030b4c821)


## 🤖 Technologies 🤖

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![Mosquitto](https://img.shields.io/badge/mosquitto-%233C5280.svg?style=for-the-badge&logo=eclipsemosquitto&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)
![Figma](https://img.shields.io/badge/figma-%23F24E1E.svg?style=for-the-badge&logo=figma&logoColor=white)

---

| Technology             | Version |
|:-----------------------|:--------|
| JDK                    | 17      |
| JavaScript             | 1.8.5   |
| Maven                  | 4.0.0   |
| TomCat                 | 9.0.50  |
| PostgreSQL             | 16.1    |
| Spring (WEB, Security) | 5.2.2   |
| Hibernate              | 5.4.27  |
| JUnit                  | 5.8.1   |


## 🏃‍ How to run application 🏃
1. Clone the project to your IDE from GitHub.
2. Configure connection to DB in resources in file db.properties ([this fields](https://github.com/viktor-levic/b9-route-ride-manager/blob/main/src/main/src/main/resources/db.properties#L2)) with your own URL, username, password and JDBC driver.
3. Configure Tomcat (recommended [9.0.50 version](https://archive.apache.org/dist/tomcat/tomcat-9/v9.0.50/bin/)).
4. Run program using `Shift + F10`.
5. The window must automatically open in your browser, if not type this URL `http://localhost:8080/login` or `http://localhost:8080/`.
6. You can log in as user using login: `user@i.ua` and password: `user123` or admin using login: `admin@i.ua` and password: `admin123`.
7. Enjoy.

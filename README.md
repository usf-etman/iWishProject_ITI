# iWishProject_ITI
## Introduction
iWish is a desktop application where the user adds friends, creates his wish list, checks his friends’ wish lists and makes his friends happy by contribution in buying items from their wish lists.

The application is a 3-layered application, namely: client, server & database

![image](https://user-images.githubusercontent.com/80813924/162042819-45e7606c-e1a0-4278-a008-0fe3c34ea0f6.png)

## The Client
This is the users view, the UI is built using JavaFX. The client features are:
1. Register/Sign-in.
2. Forget/Reset Password.
3. Add/Remove Friend.
4. Accept/Decline Friend Request.
5. Create, Update, Delete my Wish List.
6. View my Friends list.
7. View my Friends Wish List.
8. Charge my credit.
9. Contribute in buying one or more items from a friend’s Wish List with specific amount of money of its price.
![image](https://user-images.githubusercontent.com/80813924/162043574-19ae253e-ec66-4474-834a-48b77b9f537b.png)

## The Server
This is the administrator view, the admin can do the following:
1. Start/Stop the service.
2. Add items to the application either manually or by web scraping items off of Amazon Egypt.
![image](https://user-images.githubusercontent.com/80813924/162045767-af97c735-2bd0-420f-aacd-c7eb21454b4e.png)

## The Database
The final layer is the data layer, our database is built on the cloud. Specifically, on AWS RDS service that is running an Oracle database.
The ERD design for our database is as follows.
![image](https://user-images.githubusercontent.com/80813924/162047522-ed5272e0-e580-4d24-bee6-bd222131846a.png)

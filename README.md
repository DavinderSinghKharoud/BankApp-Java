# BankApp-Java

## Tools And Libraries Used:

1. Eclipse IDE
2. Java

* ### Application Functions
 >Application to handle new customer bank account requests.
 
1.) Read a .CSV file of names, social security numbers, account type and initial deposit.<br/> 
2.) Used a proper data structure to hold all accounts.<br/> 
3.) Both Savings and Checking accounts share the following properties:<br/> 
* deposit()
* withdraw()
* tranfer()
* showInfo()

>11-Digit Account Number (generated with the following process: 1 or 2 depending on Savings or Checking last two digits of SSN, 
unique 5-digit number, and random 3-digit number).<br/>

4.) Savings Account holders are given a Safety Deposit Box, identified by a 3-digit number and accessed with a 4-digit code.<br/> 
5.) Checking Account holders are assigned a Debit Card with 12-digit number and 4-digit PIN.<br/> 
6.) Both accounts will use an interface that determines the base interest rate<br/> 
* Savings accounts will use .25 points less thant the base rate.
* Checking accounts will use 15% of the base rate.
7.) The ShowInfo method should reveal relevant account information as well as information specific to the Checking account or
Savings account.<br/> 

### Learning objectives:
* Learn to develop a robust application architecture.
* Use when to use abstract classes and abstract methods.
* Use an interface API to receive information from a developer's application.
* Explore constructors deeper and use the super() keyword.
* Explore access modifiers and when to use public, private, or protected.
* Read data from a file and store in an appropriate data structure.
* Generate random numbers and work with String API.

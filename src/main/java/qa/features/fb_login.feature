Feature: FB Application Test

#Without Examples
Scenario: FB login test
Given user open browser and go to url of login page
When title of login page is Facebook - Log In or Sign Up
Then verify FB logo is present
Then user enters username and password
Then user click on logIn button
Then user see error message 
Then close the browser
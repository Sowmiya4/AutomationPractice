Feature: Login functionality for adactin application 

Background: 
	Given user enter application url 
	And user enter "SowmiyaSri" as username 
	And user enter "Sowmiya05" as password 
	Then user verify the valid username and valid password in the homepage 
	
@Login 
Scenario Outline: Successfull login into the adactin application with valid credential 
	When user enter the application url 
	And user enter '<username>' as username 
	And user enter '<password>' as password 
	Then user verify the username in the homepage 
	
	Examples: 
		|username|password|
		|Mahamilky|hari.9500|
		|anuamu04|9003881833|
		|SowmiyaSri04|Sowmiya05|
		
@SearchHotel 
Scenario: Successfull login into the adactin application with valid credential 
When user enter location 
And user enter hotels 
And user enter room 
And user enter numbrooms 
And user enter check in date 
And user enter check out date 
And user enter adult 
And user enter children 
Then user verify the username in the searchpage 
When user select radio button 
Then user click continue in the bookingpage 
When user enter Firstname 
And user enter Lastname 
And user enter Address 
And user enter Cardno 
And user enter Cardtype 
And user enter Expirymonth 
And user enter Expiryyear 
And user enter Cvvnumber 
And user enter Booknow 
Then user click login in the conformationpage 
			
			
@SearchHotel1 
Scenario: Successfull login into the adactin application with valid credential 
When user enter location 
And user enter hotels 
And user enter room 
And user enter numbrooms 
And user enter check in date 
And user enter check out date 
And user enter adult 
And user enter children 
Then user verify the username in the searchpage 
When user select radio button 
Then user click continue in the bookingpage 
When user enter Firstname 
And user enter Lastname 
And user enter Address 
And user enter Cardno 
And user enter Cardtype 
And user enter Expirymonth 
And user enter Expiryyear 
And user enter Cvvnumber 
And user enter Booknow 
Then user click login in the conformationpage 
			
			

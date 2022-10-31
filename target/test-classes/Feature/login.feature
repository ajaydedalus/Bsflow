Feature: Verifying the Lims web page

Scenario Outline:
To validate the lims login with valid username and password
Given user is on the lims login page
When user enter valid "<username>"and"<password>"
And user click the login button
And user click the menu
And user click the order entry
And user enter valid "<Givenname>","<Familyname>"
And user click the search button
And user click the New order button
And user click patient catagory
And user click the result
And user enter the result

Examples:
|username||password||Givenname||Familyname|
|VM      ||Pas123  ||patient  ||search    |











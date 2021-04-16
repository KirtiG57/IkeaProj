#----------------------------------
# Empty Cucumber .feature file
#----------------------------------
    
Feature:  IKEA Home Furniture, Décor & Outdoors Feature

Scenario: Ikea Login Test Scenario
Given user is already on Login home Page
Then user clicks on Sign in
Then user enters username
Then user enters password
Then user clicks continue 
Then user closes brower for Login

Scenario: Product Test Scenario
Given user is already on Product home Page
Then user click on product 
And click on lightening
Then user click on Led Light Bulbs
Then user click on Add to bag
Then user click on Continue to bag
Then user click to Checkout
Then user closes brower for Product

Scenario: Room Test Scenario
Given user is already on Room home Page
Then user click on Room
Then user click on images
Then user select color
And Then select price range
Then user click on Add to bag
Then user click on Continue to bag for Room
Then user click to Checkout for Room
Then user closes brower for Room
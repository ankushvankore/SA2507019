Feature: Registration on DemoQA

  Background: 
    Given Launch DemoQA site

  Scenario: Validate registration process on DemoQA site with valid data
    When I Enter valid first name as "Siddharth"
    When I Enter valid last name as "Sharma"
    When I Enter valid email id as "siddhu@gmail.com"
    Then Registration should successful

  Scenario: Validate registration process on DemoQA site with invalid data
    When I Enter invalid first name as "Sumedha"
    When I Enter invalid last name as "Rahate"
    When I Enter invalid email id as "sumedha@gmail.com"
    Then Registration should not successful

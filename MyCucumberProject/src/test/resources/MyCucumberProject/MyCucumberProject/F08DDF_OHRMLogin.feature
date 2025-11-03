Feature: OHRM Login

  Scenario Outline: To validate login functionality on OHRM
    Given Launch OHRM Site "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When I Enter valid user name as "<UserName>" and valid password as "<Password>"
    And I Click on the Login button
    Then Dashboard page should display

    Examples: 
      | UserName  | Password  |
      | admin     | admin123  |
      | aparna    | aparna123 |
      | admin     | admin123  |
      | siddharth | siddhu123 |

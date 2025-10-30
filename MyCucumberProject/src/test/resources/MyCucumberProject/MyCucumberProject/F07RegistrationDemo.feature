Feature: Registration

  Scenario: To validate registration process on the page
    Given Launch the registration page
    When Enter following data
      | Supriya | Mehar   | supriya@gmail.com | Noida    | 9898989898 |
      | Gaurav  | Bhatale | gaurav@gmail.com  | Kolhapur | 7878787878 |
    Then Registration should successfull

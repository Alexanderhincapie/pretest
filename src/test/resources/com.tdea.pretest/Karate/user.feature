Feature: user
  Scenario: Create user
    Given url 'http://localhost:8080/user'
    And request {username: "faraon", password: "loveshady"}
    When method post
    Then status 200

  Scenario: Login user
    Given url 'http://localhost:8080/user/login'
    And param username = 'faraon'
    And param password = 'loveshady'
    When method get
    Then status 200
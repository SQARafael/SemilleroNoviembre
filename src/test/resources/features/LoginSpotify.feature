Feature: Login Spotify
  Scenario Outline: Login successfully in Spotify
    Given User open the browser
    And  user do click on button login
    When User insert credentials "<User>" "<Password>" and click on login
    Then User can view the profile button
    Examples:
      | User                    | Password       |
      | juliana.ocampo@sqasa.co | Semillero2023* |

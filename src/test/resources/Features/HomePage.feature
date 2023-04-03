@amplience
Feature: Verify GitHub user information on profile page.

  Scenario Outline: Verify user information on GitHub profile page.

    Given User navigate to the URL and provide userIDs "6wl"
    Then User request the GitHub user name "<name>"
    And User request the GitHub user location "<location>"
    And User request the GitHub user public repos <public_repos>
    And User request the GitHub user followers <followers>
    And User request the GitHub user following <following>


    Examples: user information
      | name             | location   | public_repos | followers | following |
      | Gregory Loscombe | Manchester | 6            | 20        | 34        |


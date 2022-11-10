Feature: Searching data in google

  Scenario Outline: Searching data in Google by giving different inputs
    Given Browser is launched and google search page is displayed
    When Enter the data and '<Sheetname>' for <rownumber>
    Then Click on the links available on the screen

    Examples:
      | Sheetname |rownumber|
      | Search |0|
      | Search |1|
      | Search |2|
      | Search |3|
      | Search |4|
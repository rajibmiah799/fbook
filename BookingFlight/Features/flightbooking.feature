@flightbooking
Feature: booking funcanility test

  Scenario Outline: buying a air ticket
    Given user on sign on page
    When user enter "<username>", "<password>"
    And user click on submit
    And user enter "<type>", "<passengers>", "<deperting from>", "<on month>", "<on date>", "<arriving in>", <"returning month>", "<returning date>", "<service class>"
    And user click on continue
    Then user see some relevent air tickets

    Examples: 
      | username | password | type      | passengers | deperting from | on month | on date | arriving in | returning month | returning date | service class |
      | md rajib | Ra4789   | roundtrip |          2 | new york       | march    |      25 | london      | april           |             22 | economy class |

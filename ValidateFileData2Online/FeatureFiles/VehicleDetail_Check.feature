#Author: Jay.YR
@tag
Feature: Are Vehicle details correct?
  I want to verify if the Vehicle details on file are true compared to DVLA

  @DefaultScenario
  Scenario Outline: Check Vehicle Make/Model
    Given I want to traverse a folder "<Input Directory>" for files
    When files of supported fileformats "<Supported MIMETypes>" are available
    Then read files one by one for Vehicle Details
    And open url "<URI>" in firefox browser
    Then key in Vehicle regno and verify detail

    Examples: 
      | Input Directory                                | Supported MIMETypes | URI                                                 |
      | C:\\Users\\Dillu\\Documents\\DVLA Files        | CSV, XLS, XLSX      | https://www.gov.uk/get-vehicle-information-from-dvla |
      | C:\\Users\\Dillu\\Documents\\DVLA Files - Copy | CSV, XLS, XLSX      | https://www.gov.uk/get-vehicle-information-from-dvla |

$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("VehicleDetail_Check.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Jay.YR"
    }
  ],
  "line": 3,
  "name": "Are Vehicle details correct?",
  "description": "I want to verify if the Vehicle details on file are true compared to DVLA",
  "id": "are-vehicle-details-correct?",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Check Vehicle Make/Model",
  "description": "",
  "id": "are-vehicle-details-correct?;check-vehicle-make/model",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@DefaultScenario"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I want to traverse a folder \"\u003cInput Directory\u003e\" for files",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "files of supported fileformats \"\u003cSupported MIMETypes\u003e\" are available",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "read files one by one for Vehicle Details",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "open url \"\u003cURI\u003e\" in firefox browser",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "key in Vehicle regno and verify detail",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "are-vehicle-details-correct?;check-vehicle-make/model;",
  "rows": [
    {
      "cells": [
        "Input Directory",
        "Supported MIMETypes",
        "URI"
      ],
      "line": 15,
      "id": "are-vehicle-details-correct?;check-vehicle-make/model;;1"
    },
    {
      "cells": [
        "C:\\Users\\Dillu\\Documents\\DVLA Files",
        "CSV, XLS, XLSX",
        "https://www.gov.uk/get-vehicle-information-from-dvla"
      ],
      "line": 16,
      "id": "are-vehicle-details-correct?;check-vehicle-make/model;;2"
    },
    {
      "cells": [
        "C:\\Users\\Dillu\\Documents\\DVLA Files - Copy",
        "CSV, XLS, XLSX",
        "https://www.gov.uk/get-vehicle-information-from-dvla"
      ],
      "line": 17,
      "id": "are-vehicle-details-correct?;check-vehicle-make/model;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 445216493,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Check Vehicle Make/Model",
  "description": "",
  "id": "are-vehicle-details-correct?;check-vehicle-make/model;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    },
    {
      "line": 6,
      "name": "@DefaultScenario"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I want to traverse a folder \"C:\\Users\\Dillu\\Documents\\DVLA Files\" for files",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "files of supported fileformats \"CSV, XLS, XLSX\" are available",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "read files one by one for Vehicle Details",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "open url \"https://www.gov.uk/get-vehicle-information-from-dvla\" in firefox browser",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "key in Vehicle regno and verify detail",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "C:\\Users\\Dillu\\Documents\\DVLA Files",
      "offset": 29
    }
  ],
  "location": "ScenarioTest.i_want_to_traverse_a_folder_for_files(String)"
});
formatter.result({
  "duration": 406254666,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CSV, XLS, XLSX",
      "offset": 32
    }
  ],
  "location": "ScenarioTest.files_of_supported_fileformats_are_available(String)"
});
formatter.result({
  "duration": 19036224,
  "status": "passed"
});
formatter.match({
  "location": "ScenarioTest.read_files_one_by_one_for_Vehicle_Details()"
});
formatter.result({
  "duration": 1722771797,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.gov.uk/get-vehicle-information-from-dvla",
      "offset": 10
    }
  ],
  "location": "ScenarioTest.open_url_in_firefox_browser(String)"
});
formatter.result({
  "duration": 13606660906,
  "status": "passed"
});
formatter.match({
  "location": "ScenarioTest.key_in_Vehicle_regno_and_verify_detail()"
});
formatter.result({
  "duration": 19894395988,
  "status": "passed"
});
formatter.before({
  "duration": 6392226,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Check Vehicle Make/Model",
  "description": "",
  "id": "are-vehicle-details-correct?;check-vehicle-make/model;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    },
    {
      "line": 6,
      "name": "@DefaultScenario"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I want to traverse a folder \"C:\\Users\\Dillu\\Documents\\DVLA Files - Copy\" for files",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "files of supported fileformats \"CSV, XLS, XLSX\" are available",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "read files one by one for Vehicle Details",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "open url \"https://www.gov.uk/get-vehicle-information-from-dvla\" in firefox browser",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "key in Vehicle regno and verify detail",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "C:\\Users\\Dillu\\Documents\\DVLA Files - Copy",
      "offset": 29
    }
  ],
  "location": "ScenarioTest.i_want_to_traverse_a_folder_for_files(String)"
});
formatter.result({
  "duration": 20591002,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CSV, XLS, XLSX",
      "offset": 32
    }
  ],
  "location": "ScenarioTest.files_of_supported_fileformats_are_available(String)"
});
formatter.result({
  "duration": 7956336,
  "status": "passed"
});
formatter.match({
  "location": "ScenarioTest.read_files_one_by_one_for_Vehicle_Details()"
});
formatter.result({
  "duration": 110139556,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.gov.uk/get-vehicle-information-from-dvla",
      "offset": 10
    }
  ],
  "location": "ScenarioTest.open_url_in_firefox_browser(String)"
});
formatter.result({
  "duration": 8920679754,
  "status": "passed"
});
formatter.match({
  "location": "ScenarioTest.key_in_Vehicle_regno_and_verify_detail()"
});
formatter.result({
  "duration": 14886918871,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[WHIT]E\u003e but was:\u003c[BLU]E\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.stepDefinitions.ScenarioTest.key_in_Vehicle_regno_and_verify_detail(ScenarioTest.java:156)\r\n\tat ✽.Then key in Vehicle regno and verify detail(VehicleDetail_Check.feature:12)\r\n",
  "status": "failed"
});
});
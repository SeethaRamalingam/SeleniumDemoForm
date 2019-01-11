#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Simple Form Demo
 

  @tag1
  Scenario: User selects simple form demo
    Given The user is in seleniumeasy.com page
    And User navigates selects Simple Form Demo
    When User enters details in Single Input Field
    |Testing Purpose|
    And User eenters details in Two Input Fields
    |a|5|
    |b|10|
    
    Then The user entered message should be displayed
    

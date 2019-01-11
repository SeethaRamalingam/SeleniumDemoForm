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
Feature: CheckBox Demo
 

  @tag1
  Scenario: User selects simple form demo
    Given The user is in seleniumeasy.com page
    And User navigates to CheckBox Demo
    When User enters Seingle Check Box Demo
    And User enters Multiple check Box Demo
    Then User selects UncheckAll
    

    

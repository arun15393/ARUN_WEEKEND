@tag
Feature: Khan Academy Login Page Automation
  I want to use this template for my feature file

  @tag1
  Scenario: Login to khan academy
    Given I am in khanacademy starting page
    When khan academy site opened
    Then I should see "Learners start here,Teachers start here,Parents start here" text
    And "You can learn anything for free for everyone forever" text

  @tag2
  Scenario: List of Modules in bottom
    Given I am in khanacademy starting page
    When khan academy site opened
    Then I should see modules in bottom of the page

  @tag3
  Scenario: List of Courses
    Given I am in khanacademy starting page
    When I click "Learners start here" button
    Then I should see list of courses available displayed

  @tag4
  Scenario Outline: List of Courses in dropdown
    Given I am in khanacademy starting page
    When I select courses dropdown
    Then I should see list of courses
    And I should see <subject> <courses>

    Examples: 
      | subject      | courses    |
      | Math         | Early math |


Run feature files from terminal
-- to run all tests
mvn test
mvn test -Dtest=TestRunner

--to run all cucumberfeature files
mvn clean test -Dcucumber.options="--tags ~@nonexistantTag"

--run test with of tag
mvn test -Dcucumber.options="--tags @addtag"
--run tests of multiple tags
mvn test -Dcucumber.options="--tags @addtag,@combinedtag"

CombinedStepDefinitions

mvn test -Dtest=CombinedStepDefinitions

# This is a comprehensive Tutorial to cover the Cucumber features
 - Maven dependencies
       
        <dependency>
        	<groupId>info.cukes</groupId>
        	<artifactId>cucumber-java</artifactId>
        	<version>1.2.5</version>
        	<scope>test</scope>
        </dependency>
        
        <dependency>
        	<groupId>info.cukes</groupId>
        	<artifactId>cucumber-junit</artifactId>
        	<version>1.2.5</version>
        	<scope>test</scope>
        </dependency>
# Gherkin Language

- Feature
- Scenario
- Scenario Outline
- Background
- Given
- When
- Then
- And
- But
- Datatable
- Doc Strings
- Gherkin Expressions

# Tags

# Hooks
Website used : http://book.theautomatedtester.co.uk/chapter8

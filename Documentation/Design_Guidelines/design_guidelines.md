### Table of Contents
**[Documentation Design](#documentation-design)**<br>
**[Database Design](#database-design)**<br>
**[Test Design](#test-design)**<br>


## Documentation Design

### What is Just Barely Good Enough (JBGE)?

JBGE is a notion within Agile Modelling stating that Agile Models and documents are sufficient enough for the task at hand.

### Why follow JBGE guidelines?

Rather than spending too much time producing highly detailed documentation that may never be read or provide any real value, focus on making it simple and easy to read instead.

### JBGE in practice

Documentation should be considered as "living", constantly developing it when needed gives the documentation longevity. When in practice, focus on the purpose of the document, what is it that you already know and what does the reader need to know. It is important to be minimal, making it easier to understand by saying less.

Develop documentation using live Word documents, or a wiki page can be used as github provides [wikis](https://docs.github.com/en/communities/documenting-your-project-with-wikis/about-wikis) to host documentation, where everyone can collaborate and contribute.

### JBGE summary

* Documentation is considered "living", it should be constantly updated when needed and readers should provide feedback on it.

* If an artifact has met its intended purpose it is JBGE, attempting to invest more time into it is considered a waste.

* Use collaborative documentation tools such as github wikis or live word documents.

## Database Design

### Standardization

The team should all agree on a naming scheme when designing the database, in particular, for the database tables. Schemes such as underscore_case or camelCasing  are appropriate but only one can be chosen.

It is important to have standardization due to the simplicity it brings when querying the database. A team member won't need to waste valuable time recalling if the table attribute is, for example, user_address or userAddress.

### Table names

Database tables will be designed around entities and should have simple names without any unnecessary information, for example "UserTable" has poor naming as table does not provide useful information since we know it is a table for the user entity.

### Column names

Column names within a table should be defined clearly without any room for ambiguity. Including the table name and the attribute name will provide the clarity needed, for example a table named "Customer" and an attribute "Address" should be labelled as "CustomerAddress".

### Data integrity

Design should include strong emphasis on the accuracy and consistency of stored data. In most schemas, entities have relationships with other entities, leading to tables referencing other tables. These references can be upheld using foreign keys. Without using foreign keys, data integrity will be at risk, possibly resulting in a row that doesn't exist being referenced. Foreign keys should be named the same as the row they are referring to.

### Database design summary

* Standardization must be implemented through the team agreeing on a naming scheme for tables/attributes such as camelCase.

* Table names should be simplistic, without adding unnecessary information. Column names should combine the table name and attribute name, e.g. "CustomerAddress"

* When referencing other tables, use foreign keys to maintain data integrity.

* When representing unknown values in a database, use NULL instead of empty strings, spaces, etc.

## Test Design

### Shift-Left testing

Shift left is a testing concept within an agile DevOps enviornment that focuses on "pushing" testing to the early stages of the development lifecycle (to the left). This will allow the team to refine code quality through reducing the number bugs with the intent of avoiding critical bugs during the deployment phase as well as ensuring requirements are being met. 

Examples of shift-left testing include:

* Unit testing
* Integration testing

### Incorporating the shift-left approach

This approach can be incorporated by ensuring developers take part in testing (testing their code prior to pushing to the main branch) and testers being involved early on in the planning/design phases so that they can construct better tests for the continuous testing stage. 

Static code analysis tools should be used and continuous feedback should be given to both developers and testers to address any gaps in development.

### Test techniques

Test creation techniques often include:

* Test scripts - generally has a detailed set of steps that describe how to use a program/working product.

* Test driven development (TDD) - tests are created for every functionality of the product prior to the code being developed. If the test fails, new code is written to pass the test. TDD is most appropriate for unit tests.

![TDD](https://marsner.com/wp-content/uploads/test-driven-development-TDD.png)

* Behavior driven development (BDD) - is a testing technique that can be used to create automated tests during continuous testing. It focuses on describing features of the application in a simple way using the "Given-When-Then" language. For example:

* Given I am creating an account for a comic convention booking website
* When I submit my personal details
* Then I receive a registration confirmation email

### Test Case Example

![Test Case Example](http://tryqa.com/wp-content/uploads/2017/07/Test_case-1024x313.png)
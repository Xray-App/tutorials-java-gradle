# tutorials-java-gradle
Tutorials showcasing the integration between Gradle and Xray Test Management.

## Overview

Each folder contains a project that can be built using Gradle (and also Maven, just for reference).
There are examples both for JUnit (4 and 5) and TestNG.
A basic test class example is provided showcasing the chosen testing framework built-in capabilities (i.e., using only the built-in XML report provided by that framework).
Besides, there's also an enhanced example that uses specific extensions for Xray, allowing users to embed additional information during the execution of the tests.

- [junit4_basic](junit4_basic): some tests implementedusing JUnit 4.13.x, generating a "standard" JUnit XML report
- [junit5_basic](junit5_basic): some tests implemented using JUnit 5, generating a "standard" JUnit XML report
- [junit5_enhanced](junit5_enhanced): some tests implemented using JUnit 5, using annotations and other capabilities from [xray-junit-extensions](https://github.com/Xray-App/xray-junit-extensions), generating a enhanced JUnit XML report that Xray can process
- [testng_basic](testng_basic): some tests implemented using TestNG 7.6.x, generating a "standard" TestNG XML report
- [testng_enhanced](testng_enhanced): some tests implemented using TestNG 7.6.x, using annotations and other capabilities from [xray-testng-extensions](https://github.com/bitcoder/xray-testng-extensions), generating a enhanced TestNG XML report that Xray can process

## Prerequisites
In order to run this tutorial you need to have Java 11+ and Gradle 7.4.2+.

## Running
Tests can be executed locally with the following command
```
gradle clean compileJava test
```

To generate the enhanced TestNG XML report that Xray can process (as shown on [testng_enhanced](testng_enhanced)), we need to run the tests with a custom task. For more info, check build.gradle.
```
gradle clean compileJava testngTest
```

## Submitting results to Jira

Results can be submitted to Jira so that they can be shared with the team and their impacts be easily analysed.
This can be achieved using [Xray Test Management](https://www.getxray.app/) as shown in further detail in this [page]().

## Contact

Any questions related with this code, please raise issues in this GitHub project. Feel free to contribute and submit PR's.
For Xray specific questions, please contact [Xray's support team](https://jira.getxray.app/servicedesk/customer/portal/2).

## References

- [Integration between Xray and Gradle]()

## LICENSE

[BSD 3-Clause](LICENSE)

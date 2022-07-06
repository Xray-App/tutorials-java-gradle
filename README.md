# tutorials-java-gradle
Tutorials showcasing the integration between Gradle and Xray Test Management.

## Overview

Each folder contains a project that can be built using Gradle (and also Maven, just for reference).
There are examples both for JUnit (4 and 5) and TestNG.
A basic example is provided showcasing the testing framework built-in capabilities (i.e., using only the built-in XML report provided by that framework).

## Prerequisites
In order to run this tutorial you need to have Java 11+ and Gradle 7.4.2+.

## Running
Tests can be executed locally with the following command
```
gradle clean compileJava test
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

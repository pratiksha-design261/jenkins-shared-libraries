def call(String SonarQubeAPI, String ProjectName, String ProjectKey) {
    withSonarQubeEnv("${SonarQubeAPI}"){
        sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${ProjectName} -Dsonar.projectKey=${ProjectKey}"
    }
}

// String SonarQubeAPI: The first parameter, a string, represents the name of the SonarQube server environment that Jenkins will use.
// String Projectname: The second parameter, a string, represents the name of the project that will be scanned by SonarQube.
// String ProjectKey: The third parameter, a string, is a unique key to identify the project in SonarQube.

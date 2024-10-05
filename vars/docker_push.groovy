def call(String DockerHubUser, String ProjectName, String ProjectTagName) {
    withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'dockerhubpass', usernamevariable: 'dockerhubuser')]) {
        sh "docker login -u ${dockerhubpass} -p ${dockerhubuser}"
    }
    sh "docker push ${dockerhubpass}/${ProjectName}:${ProjectTagName}"
}

def call(String DockerHubUser, String ProjectName, String ProjectTagName) {
    withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'dockerhubpass', usernamevariable: 'dockerhubuser')]) {
        sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
    }
    sh "docker push ${dockerhubpass}/${ProjectName}:${ProjectTagName}"
}

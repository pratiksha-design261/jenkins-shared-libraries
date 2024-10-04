def call(String DockerHubUser, String ProjectName, String ProjectTagName) {
    withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'dockerhubpass', usernamevariable: 'dockerhubuser')]) {
        sh "docker login -u ${usernamevariable} -p ${passwordVariable}"
    }
    sh "docker push ${DockerHubUser}/${ProjectName}:${ProjectTagName}"
}

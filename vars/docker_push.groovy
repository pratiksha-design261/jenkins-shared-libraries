def call(String dockerhubuser, String ProjectName, String ProjectTagName){
  withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]) {
      sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
      sh "echo ${dockerhubuser},${dockerhubpass},${ProjectName},${ProjectTagName}"
  }
  sh "docker push ${dockerhubuser}/${ProjectName}:${ProjectTagName}"
}

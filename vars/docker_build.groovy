def call(String DockerUserName, String imageName, String tagName){
    sh "docker build -t ${DockerUserName}/${imageName}:${tagName} ."
}

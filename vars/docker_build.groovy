def call(string DockerUserName, string imageName, string tagName){
    sh "docker build -t ${DockerUserName}/${imageName}:${tagName} ."
}

def call(String DockeruserName, String imageName, String tagName){
    sh "docker build -t ${DockeruserName}/${imageName}:${tagName} ."
}

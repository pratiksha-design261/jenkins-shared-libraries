def call(String DockeruserName, String imageName, String tagName){
    sh "echo "docker build -t ${DockeruserName}/${imageName}:${tagName} .""
    sh "docker build -t ${DockeruserName}/${imageName}:${tagName} ."
}

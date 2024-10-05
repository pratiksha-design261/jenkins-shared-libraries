//def call(String DockeruserName, String imageName, String tagName){
   // sh "docker build -t ${DockeruserName}/${imageName}:${tagName} ."
//}
// Define function
def call(String ProjectName, String ImageTag, String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}

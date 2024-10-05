def call(String Project_repo_name, String branch) {
  withCredentials([usernamePassword(credentialsId: 'github', usernameVariable: 'GIT_USERNAME', passwordVariable: 'GIT_PASSWORD')]) {
    sh "git push https://${GIT_USERNAME}:${GIT_PASSWORD}@github.com/pratiksha-design261/${Project_repo_name}.git ${branch}"
  }
}

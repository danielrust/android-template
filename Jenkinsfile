node {
    try{
        stage('Build'){
            checkout scm
        }
    }catch (e) {
        currentBuild.result = "FAILED"
        throw e
      } finally {
        notifyBuild(currentBuild.result)
    }
}

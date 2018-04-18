node {
    try{
        stage('Build'){
            checkout scm
            currentBuild.result = "SUCCESS"
        }
    }catch (e) {
        currentBuild.result = "FAILED"
        throw e
      } finally {
        echo currentBuild.result
    }
}

pipeline{
    agent any

    checkout scm
    stages{
    stage('Build'){
        try{
            sh './gradlew clean assembleAlpha testAlphaUnitTest lintAlpha'
            currentBuild.result = 'SUCCESS'
        } catch(error){
            currentBuild.result = 'FAILURE'
        } finally {
            sh '/var/lib/jenkins/upload.sh .gospel-library-alpha.apk ic_launcher alpha'
        }
    }
}
}

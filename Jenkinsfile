pipeline{
    agent any

checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/danielrust/android-template.git']]])
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

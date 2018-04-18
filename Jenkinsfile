pipeline{
    agent any

checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/danielrust/android-template.git']]])
    stages{
    stage('Build'){
        try{
            sh './gradlew clean'
            currentBuild.result = 'SUCCESS'
        } catch(error){
            currentBuild.result = 'FAILURE'
        } finally {
            echo 'all done!'
        }
    }
}
}

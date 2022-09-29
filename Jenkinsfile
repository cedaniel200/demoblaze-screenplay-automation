pipeline {
    agent {label "windows"}
    parameters {
        string(name: 'ENV', defaultValue: 'prod', description: 'Ambiente de ejecución [dev | prod], por defecto se usa prod')
    }
    stages {
        stage('build') {
            steps {
                bat 'gradlew.bat clean build -x test'
            }
        }
        stage('test-chrome') {
            steps {
                catchError(buildResult: 'SUCCESS', message: 'Uno o más test en chrome fallaron, por favor revisar el reporte', stageResult: 'FAILURE') {
                    bat "gradlew.bat test -Dcontext=chrome -Dwebdriver.driver=chrome -Denvironment=${params.ENV}"
                }
            }
        }
        stage('test-firefox') {
            steps {
                catchError(buildResult: 'SUCCESS', message: 'Uno o más test en firefox fallaron, por favor revisar el reporte', stageResult: 'FAILURE') {
                    bat "gradlew.bat test -Dcontext=firefox -Dwebdriver.driver=firefox -Denvironment=${params.ENV}"
                }
            }
        }
        stage('aggregate') {
            steps {
                bat 'gradlew.bat aggregate'
            }
        }
        stage('publish report'){
            steps {
                publishHTML([
                    allowMissing: false,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'target/site/serenity',
                    reportFiles: 'index.html',
                    reportName: 'SerenityBDD',
                    reportTitles: ''
                ])
            }
        }
    }
}
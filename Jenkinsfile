node() {
    def repoURL = 'https://github.com/Assilhizaoui/ProjectChannel.git'
    stage('Checkout Self') {
        git branch: 'master', credentialsId: '', url: repoURL
    }
    stage('Cucumber Tests') {
        withMaven(maven: 'maven3.8.4') {
		    bat	'mvn clean test'
        }
  stage('Expose report') {
        archive "**/cucumber.json"
        cucumber '**/cucumber.json'
    }
	
}

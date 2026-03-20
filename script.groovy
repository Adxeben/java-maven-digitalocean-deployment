/**
 * Builds the Java application using Maven.
 * This function compiles the code and packages it into a JAR/WAR file.
 */

def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

/**
 * Builds and pushes a Docker image to Docker Hub.
 * It uses stored Jenkins credentials for authentication.
 */

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t nanajanashia/demo-app:jma-2.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push nanajanashia/demo-app:jma-2.0'
    }
} 

/**
 * Deploys the application to the target environment.
 * (Currently a placeholder - deployment logic can be added here)
 */
 
def deployApp() {
    echo 'deploying the application...'
} 

return this
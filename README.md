# **🚀 Java Application Deployment on DigitalOcean with Nexus**


## **Project Overview**
_This project demonstrates the deployment of a Java Maven application to a cloud infrastructure. A Linux virtual machine (Droplet) was provisioned on DigitalOcean, and the firewall was configured for secure access. Java JDK 8 and Sonatype Nexus Repository were installed on the server._

_The Maven project was configured to publish to Nexus, the application was built locally, published to Nexus, retrieved, and executed on the server._

<br/>

### **Technologies Used:** 
1. Java
2. Maven
3. Linux (Ubuntu)
4. Nexus Repository
5. DigitaOcean Droplet

<br/>

### **Workflow:** 
> Configure → Build → Publish → Retrieve → Deploy → Run

<br/>

### **Steps Performed**

1. **Provisioned Cloud Infrastructure**
   - Created a DigitalOcean Droplet (server) 
   - Configured the firewall for secure access

<br/>

2. **Installed Required Software**
   - Installed Java JDK 8 on the server
   - Installed Nexus Repository using the (`wget`) command
   - Created a system service account to run Nexus
   - Created a regular user account with permissions to access and run Nexus
   - Built the Java Maven Application

<br/>

3. **Configured Maven Project for Nexus Deployment**
   - Added Nexus repository information in `pom.xml` (`distributionManagement`)
   - Added credentials in `settings.xml` (`<server>` element with username and password)
      > This step ensures Maven knows where to publish the artifact and which credentials to use.

<br/>

4. **Built the application locally using:**
    - `mvn clean package`

5. **Published Artifact to Nexus**
    - Created a Nexus user with the required roles and privileges to deploy artifacts
    - Published the artifact to a hosted snapshot repository:
       - `mvn clean deploy`

<br/>

6. **Retrieved Artifact to Server**
    - Downloaded the published artifact from Nexus:
    - `wget --user=USERNAME --password=PASSWORD http://SERVER_IP:8081/repository/maven-snapshots/com/example/java-maven app/1.1.0-SNAPSHOT/java-maven-app-1.1.0-20260321.123456-1.jar -O my-app.jar`

<br/>

7. **Deployed and Ran the Application**
    - Executed the retrieved artifact on the server:
    - `java -jar my-app.jar`

<br/>

## **What I Learned**
1. Setting up and provisioning cloud servers on DigitalOcean
2. Configuring firewall and secure access
3. Installing Java JDK 8 and Nexus Repository on Linux
4. Creating service and regular user accounts with appropriate permissions
5. Configuring Maven projects for deployment to Nexus
6. Building Java applications with Maven
7. Publishing artifacts to Nexus and retrieving them to a server
8. Running Java applications remotely

<br/>

## **Future Improvements**
1. Add a CI/CD pipeline for automated builds and deployments
2. Automate artifact retrieval and application startup on the server
3. Containerize the application using Docker for easier scaling

<img width="936" height="467" alt="server droplet dashboard run" src="https://github.com/user-attachments/assets/f95b7d55-d52e-439f-8aa8-36f489719800" />

<img width="908" height="459" alt="Firewall config" src="https://github.com/user-attachments/assets/9c28805b-2d51-4328-bb36-3c0caecf11e0" />




![alt text](<screenshots/Nexus User.png>)
![alt text](<screenshots/Published artifact on Nexus.png>)
![alt text](<screenshots/Retrieval of artifact from Nexus and running on server.png>)
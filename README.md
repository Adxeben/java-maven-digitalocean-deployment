**🚀 Java Application Deployment on DigitalOcean**


**Project Overview**
> This project demonstrates deploying a Java application to a cloud infrastructure. The Java application was built using the Maven build tool, and the server infrastructure was provisioned and hosted on DigitalOcean as a Linux virtual machine (Droplet). The application was then deployed and executed on the provisioned server.


**Technologies Used:** 
> Java, Maven, Linux (Ubuntu), SSH, DigitalOcean


**Workflow:** 
> Code → Build → Transfer → Deploy → Run


**Steps Performed**
> 1. Cloned and built the java application locally
> 2. Created a server on DigitalOcean
> 3. Connected via SSH
> 4. Transferred files to the server
> 5. Ran the application


**Run Locally**
Maven
> mvn clean package


**Deployment Steps**
> 1. scp your-app.jar root@your-server-ip:/root/
> 2. ssh root@your-server-ip
> 3. java -jar your-app.jar


**What I Learned**
> 1. Java build tool (Maven)
> 2. Cloud server setup
> 3. SSH and remote deployment
> 4. Running applications in Linux


**Future Improvements**
> 1. Add CI/CD pipeline
> 2. Automate deployment
> 3. Learn Docker

<img width="936" height="467" alt="server droplet dashboard run" src="https://github.com/user-attachments/assets/f95b7d55-d52e-439f-8aa8-36f489719800" />

<img width="908" height="459" alt="Firewall config" src="https://github.com/user-attachments/assets/9c28805b-2d51-4328-bb36-3c0caecf11e0" />

<img width="928" height="536" alt="maven-java app running on server" src="https://github.com/user-attachments/assets/920e81ee-37cb-4080-bdc4-175fd09679ed" />




**🚀 Java Application Deployment on DigitalOcean**


📌 **Project Overview**
This project demonstrates deploying a Java application to a cloud server. The application was built using Maven and Gradle and deployed to a Linux server hosted on DigitalOcean.

🛠️ **Technologies Used:** 
> Java, Maven, Linux (Ubuntu), SSH, DigitalOcean


⚙️ **Workflow:** 
> Code → Build → Transfer → Deploy → Run


**🔧 Steps Performed**
1. Cloned and built the java application locally
2. Created a server on DigitalOcean
3. Connected via SSH
4. Transferred files to the server
5. Ran the application


💻 **Run Locally**
Maven
> mvn clean package


🌍 **Deployment Steps**
1. scp your-app.jar root@your-server-ip:/root/
2. ssh root@your-server-ip
3. java -jar your-app.jar


📚 **What I Learned**
1. Java build tool (Maven)
2. Cloud server setup
3. SSH and remote deployment
4. Running applications in Linux


🔮 **Future Improvements**
1. Add CI/CD pipeline
2. Automate deployment
3. Learn Docker

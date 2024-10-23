# DEVELOPER LOG

## Day 1: 2024-10-23

A day of configuration!

### **Achievements**

##### **IntelliJ multi module springboot project**
After some headache I finally found out that this worked:
* Use Spring Initializer to initialize projects -> [spring initializer](https://start.spring.io/) 
* Create empty project folder
* Add via file explorer the springboot modules to the project folder
* Open the parent project in IntelliJ
* Go to Project Settings -> Modules -> press + and add the submodules
* Set correct source, test and resource folders
* Verify that the sub-project indeed is a submodule

#### **Elasticsearch Setup** 
[Installation guide](https://www.elastic.co/guide/en/elasticsearch/reference/current/run-elasticsearch-locally.html) 
* Installing Docker with [Docker guide](https://www.docker.com/products/docker-desktop/)
* Enabling Virtualization *BIOS settings -> search SVM -> enable*
* Setting up local Elasticsearch instance [Local ES guide](https://www.elastic.co/guide/en/elasticsearch/reference/current/run-elasticsearch-locally.html)
* Save ES credentials

#### **Development Work**
* Started creating the rest client to communicate with ES



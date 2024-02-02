# Service Pipes template
Repository which will be used as a template for Service Pipes Applications projects.

## Initial setup
1. Click ***Use this template*** button 
2. Set the project name and click ***Create project*** 
4. After the repository is created go to ***Actions*** tab and select ***Setup repository*** workflow
5. Click ***Run workflow***  
   >1. Be aware that the client name will be used as package name and artifactId (deliverable name) also.   
   >   Ex: if you set the client name as **Test Name** the artifact id will be **service-pipes-testname** and the package for your sources will be **com.fintechos.servicepipes.testname**
   
   >2. Information about the versions of **service-pipes-dependencies**, **service-pipes-core** and **idp-notification-service** are found at [Service Pipes Releases](https://fintechos.atlassian.net/wiki/spaces/CAT/pages/1047429253/Releases).
       You should use the latest released versions.
6. After entering the desired values in the dropdown page click ***Run workflow***. The project will be set up accordingly (This could take a few minutes)  

1. Add service-pipes connectors dependencies (if needed) in the *dependencies* section from the **pom.xml** file
    ```xml
       <dependency>
           <groupId>com.fintechos.servicepipes.connectors</groupId>
           <artifactId>service-pipes-crku</artifactId>
           <version>${crku-version}</version>
       </dependency>
        <dependency>
           <groupId>com.fintechos.servicepipes.connectors</groupId>
           <artifactId>service-pipes-experian</artifactId>
           <version>${experian-version}</version>
       </dependency>
    ```

 The initial configuration is finished. Now you can add your custom routes or logic to the project.
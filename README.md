In this i used DCM4CHE version 2.0.29 to extract meta data.
download the zip file and extract it to a folder. 
In app.java add the location of dcm file you want to run.
to execute the code open command line. change  the directory where the project is saved using cd command .Then type   cd my-project  ,
then type   mvn package  . this will download all the neccesarry jar and other files.
then type   java -cp target/my-project-1.0-SNAPSHOT.jar;target/dcm4che-core-2.0.29.jar;target/slf4j-api-1.6.1.jar com.mycompany.app.App    
This will show all the metadata of the file.
following are some of the resources/refrences i used to learn and write the code.  
https://dcm4che.atlassian.net/wiki/spaces/d2/pages/1835034/Reading+DICOM+files     
https://www.dcm4che.org/docs/dcm4che-2.0.12-apidocs/org/dcm4che2/data/DicomObject.html   
https://www.programcreek.com/java-api-examples/?api=org.dcm4che2.data.DicomElement
https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html 

stack overflow
(https://stackoverflow.com/questions/34413/why-am-i-getting-a-noclassdeffounderror-in-java)
(https://stackoverflow.com/questions/37390031/how-to-import-dcm4che-library-to-java-project)
(https://stackoverflow.com/questions/31351753/how-to-read-the-content-of-a-dicom-file-in-java)
(https://stackoverflow.com/questions/10824027/get-the-metadata-of-a-file)

geeksfor geeks(https://www.geeksforgeeks.org/how-to-use-iterator-in-java/)
https://mvnrepository.com/artifact/dcm4che/dcm4che-core   to get dcm4che and slf4j library dependency.

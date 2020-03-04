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
stack overflow    
geeksfor geeks

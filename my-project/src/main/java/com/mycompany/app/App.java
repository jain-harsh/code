package com.mycompany.app;
import org.dcm4che2.io.*;
import org.dcm4che2.util.TagUtils;
import org.dcm4che2.data.DicomElement;
import org.dcm4che2.data.DicomObject;

import java.util.*;
import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         DicomObject object = null; 
        Scanner scn=new Scanner(System.in);
	    System.out.println("Enter location of file");
	    String location=scn.nextLine();
           try {
              DicomInputStream dis = new DicomInputStream(new File(location));
              object = dis.readDicomObject();
              dis.close();
           } catch (Exception e) {
              System.out.println(e);
              System.exit(0);
           }
          App list = new App();
           list.listHeader(object);
    }
    public void listHeader(DicomObject object) {
           Iterator iter = object.datasetIterator();
           while(iter.hasNext()) {
              DicomElement element = (DicomElement) iter.next();
              int tag = element.tag();
              try {
                 String tagName = object.nameOf(tag);
                 String tagAddr = TagUtils.toString(tag);
                 String tagVR = object.vrOf(tag).toString();
                 if (tagVR.equals("SQ")) {
                    if (element.hasItems()) {
                       System.out.println(tagAddr +" ["+  tagVR +"] "+ tagName);
                       listHeader(element.getDicomObject());
                       continue;
                    }
                 }    
                 String tagValue = object.getString(tag);    
                 System.out.println(tagAddr +" ["+ tagVR +"] "+ tagName +" ["+ tagValue+"]");
              } catch (Exception e) {
                 e.printStackTrace();
              }
           }  
        }
}

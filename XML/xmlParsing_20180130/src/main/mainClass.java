package main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class mainClass {
   public static void main(String[] args) {
      // 자바로 xml 파싱하기
      // org.w3c.dom.Document
      Document xml = null;
      try {
      
         InputSource is = new InputSource(new FileReader("E:\\temp\\blog.xml"));
      
         xml = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
         
         // root element 취득
         Element element = xml.getDocumentElement();
         
         // child node 취득
         NodeList list = element.getChildNodes();
         
         // child node 가 1개 이상인 경우
         if(list.getLength() > 0) {
            for(int i=0; i<list.getLength(); i++) {
               
               NodeList childList = list.item(i).getChildNodes();
               
               if(childList.getLength() > 0) {
                  for (int j = 0; j < childList.getLength(); j++) {
                     
                     // 데이터가 있는 애들만 출려되게 한다.
                     if(childList.item(j).getNodeName().equals("#text")==false) {
                      //  System.out.println("\t xml tag name : " + childList.item(j).getNodeName() + ", xml값 : "+childList.item(j).getTextContent());                        
                     }
                  }
               }
               System.out.println();
            }
         }
      } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (SAXException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (ParserConfigurationException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}
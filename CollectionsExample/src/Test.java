
    import java.util.*;  
    import java.io.*;  
    public class Test {  
    public static void main(String[] args)throws Exception{  
      
    Properties p=System.getProperties();  
    Set set=p.entrySet();  
      
    Iterator itr=set.iterator();  
    while(itr.hasNext()){  
    Map.Entry entry=(Map.Entry)itr.next();  
    System.out.println(entry.getKey()+" = "+entry.getValue());  
    }  
    Properties p1=new Properties();  
    p1.setProperty("name","Sonoo Jaiswal");  
    p1.setProperty("email","sonoojaiswal@javatpoint.com");  
      
    p1.store(new FileWriter("info.properties"),"Java Properties Example");  
    }  
    }  
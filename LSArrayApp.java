import java.io.*;
import java.util.*;

public class LSArrayApp{
private static Loadshedding[] data;
private static int Count=0; //instrumentation
  public static void main(String[] args)throws Exception{
      data = new  Loadshedding[2976];
      try{
      File file = new File("./Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt"); 
      BufferedReader br = new BufferedReader(new FileReader(file)); 
      String st;
      for (int i = 0; i<2976; i++){
          if ( (st = br.readLine()) != null){
               int index = st.indexOf(" ");
                  data[i] = new Loadshedding(st.substring(0,index), st.substring(index));
         }
      }
      }
       catch(Exception e){
     }
    
    if(args.length == 3){
	printAreas(args[0],args[1],args[2]);
    }
    else if (args.length == 0){
	printAllAreas();
    }
    else{
	System.out.println("Incorrect Parameters!");
    }
    
    printNoOperations();
  } 
  public static void printAreas(String stage, String day, String startTime){
      for (int i=0; i<2976; i++){
	   Count++; // instrumentation
        if ((data[i].Details()).equals(stage+"_"+day+"_"+startTime)){
            System.out.println("Area(s) to be loadshedded is/are:"+data[i].Area());
	    return;
        }
       
      }
	  System.out.println("Areas not found.");
      
  }

    public static void  printAllAreas(){
	for (int i=0; i<2976; i++){
	    System.out.println(data[i].toString());
	}
    }

    public static void printNoOperations(){
	System.out.println("The number of comparisons is: " + Count);
    }
    
}

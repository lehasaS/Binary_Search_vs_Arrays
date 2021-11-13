import java.io.*;
import java.util.*;

public class LSBSTApp{
    private static BinarySearchTree  data;
private static int Count=0; //instrumentation
  public static void main(String[] args)throws Exception{
      data = new  BinarySearchTree ();
      try{
      File file = new File("./Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt"); 
      BufferedReader br = new BufferedReader(new FileReader(file)); 
      String st;
      for (int i = 0; i<2976; i++){
	  if ( (st = br.readLine()) != null){
          int index = st.indexOf("_", 2);
               if (index == 4){
		   data.insert(new Loadshedding(st.substring(0,7), st.substring(7)));
               }
               if (index == 3){
		   data.insert(new Loadshedding(st.substring(0,6), st.substring(7)));
	       }
      }
      }
      }
       catch(Exception e){
     }

       if(args.length != 0){
	printAreas(args[0],args[1],args[2]);
    }
       /*else{
	printAllAreas();
	}*/
       // printNoOperations();
  }

      public static void printAreas(String stage, String day, String startTime){
	  if ((data.find(new Loadshedding(stage+"_"+day+"_"+startTime, null))!=null)){
	      System.out.println((data.find(new Loadshedding(stage+"_"+day+"_"+startTime, null)).toString()));
        }
	else{
	     System.out.println("Areas not found.");
      
	}
	 
  }
    
}

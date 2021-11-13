  public class Loadshedding{
         private String details;
         private String area;
         
         public Loadshedding(String details, String area){
            this.details = details;
            this.area = area;
         }
         
         public String Details(){
            return details;
         }
         
         public String Area(){
            return area;
         }

      public int compareTo(Loadshedding other){
	  return details.compareTo(other.Details());
      }

      public String toString(){
	  return " Area(s) to be loadshedd is/are:" + area;
      }
     
     }

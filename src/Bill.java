



public class Bill  {
 private static int Life;
 private static int currentLevel=0;
 
 public static void setLife(int newLife){
   Life=newLife;  
 }
  
 public static int getLife(){
     return Life;
 }
 
 public static void setBillLevel(int level){
 currentLevel=level;    
 }
 
 public static int getBillLevel(){
     return currentLevel;
 }
  
}



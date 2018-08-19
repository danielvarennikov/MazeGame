import java.sql.*;
import java.util.ArrayList;

public class Database {
    private static Connection con;
    private static Statement st;
    private static ResultSet rs;
    
    static ArrayList<String> users=new ArrayList<>();  
    static ArrayList<String> passwords=new ArrayList<>();
    static ArrayList<String> highLevelsList=new ArrayList<>();
    static ArrayList<String> usersHigh=new ArrayList<>();  
    
    public static void connect(){
        try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root","root");
         st=con.createStatement();
         System.out.println("Connected to database");
        }catch(Exception e){
            System.out.println("Couldn't connect to database: "+e);
        }
    }
    
    public static void readData(){
    try{
     String query="SELECT * FROM users2";  
     rs=st.executeQuery(query);
     while(rs.next()){
         users.add(rs.getString("username"));
         passwords.add(rs.getString("password"));
         System.out.println(rs.getString("id")+"\t"+rs.getString("username")+"\t"+rs.getString("password")+"\t"+rs.getString("age")+"\t"+rs.getString("highscore"));
     }
    }catch(Exception e){
        System.out.println("Couldn't read data: "+e);
    }    
    }
    
    public static void addData(String username,String password,int age){
        try{
    String query="INSERT INTO users2 (username,password,age,highscore) VALUES ('"+username+"','"+password+"','"+age+"','0')";
    st.executeUpdate(query);
    System.out.println("User added");
    } catch(Exception e){
        System.out.println("Couldn't insert data: "+e);
    }  
}
   

    public static void addHighscore(String currentPlayer,int level){
     try{
      String query="SELECT highscore FROM users2 WHERE username= '"+currentPlayer+"'"; 
      rs=st.executeQuery(query);
      rs.next();
      if(level>Integer.parseInt(rs.getString("highscore"))){
          String query2="UPDATE users2 SET highscore='"+level+"'WHERE username='"+currentPlayer+"'";
          st.executeUpdate(query2);
          System.out.println("Highscore updated");
      }
     }catch(Exception e){
         System.out.println("Couldn't add highscore: "+e);
     }
}
    
    public static void showHighscore(){
        try{
          String query="SELECT username, highscore FROM users2";
          rs=st.executeQuery(query);
         
          while(rs.next()){
              usersHigh.add(rs.getString("username"));
              highLevelsList.add(rs.getString("highscore"));
          }
          String highUsers[]=new String[usersHigh.size()];
          highUsers=usersHigh.toArray(highUsers);
          
          String highLevels[]=new String[highLevelsList.size()];
          highLevels=highLevelsList.toArray(highLevels);
        }catch(Exception e){
           System.out.println("Couldn't display highscores: "+e);
        }
    }

} 
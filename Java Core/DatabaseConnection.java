import java.sql.*;



public class DatabaseConnection{

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void main(String[] args) {
        try{
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_record","root","prium12345");
            statement=connection.createStatement();
            createTable();

            insertStudent(1, "Karan", "Math", "CMPN");
            insertStudent(2, "Khushboo", "JAVA", "CMPN");
            insertStudent(3, "Prithvi", "ML", "EXTC");
            insertStudent(4, "Nikita", "Python", "IT");

            findStudent(3);
            updateStudent(1, "Computer Networks");
            findStudent(1);

            deleteStudent(4);

        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void createTable(){
        try{
            statement.executeUpdate("CREATE TABLE Student(ROLL_NO INT PRIMARY KEY,NAME VARCHAR(40),SUBJECT VARCHAR(40),BRANCH VARCHAR(40));");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void insertStudent(int rollNo,String name,String subject,String branch){
        try{
            String query="INSERT INTO Student(ROLL_NO,NAME,SUBJECT,BRANCH) VALUES("+rollNo+",'"+name+"','"+subject+"','"+branch+"');";
            statement.executeUpdate(query);
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }


    public static void findStudent(int rollNo){
        try{
            String query="SELECT * FROM Student WHERE ROLL_NO="+rollNo+";";
            resultSet=statement.executeQuery(query);
            if(resultSet.next()){
                for(int i=1;i<=4;i++){
                    System.out.print(resultSet.getString(i)+" ");
                }
                System.out.println();
            }
            else{
                System.out.println("Student not found");
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void updateStudent(int rollNo,String subject){
        try{
            String query="UPDATE Student SET SUBJECT='"+subject+"' WHERE ROLL_NO="+rollNo+";";
            statement.executeUpdate(query);
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void deleteStudent(int rollNo){
        try{
            String query="DELETE FROM Student WHERE ROLL_NO="+rollNo+";";
            statement.executeUpdate(query);
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }


}
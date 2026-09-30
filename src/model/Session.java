package model;

public class Session {
    private static int userID;
    private static String username;
    private static String role;
    
    public static void startSession(int id, String user, String userRole){
        userID = id;
        username = user;
        role = userRole;
    }

    public static int getUserID() {
        return userID;
    }

    public static String getUsername() {
        return username;
    }

    public static String getRole() {
        return role;
    }
    
    public static void destroySession(){
        userID = 0;
        username = null;
        role = null;
    }
}

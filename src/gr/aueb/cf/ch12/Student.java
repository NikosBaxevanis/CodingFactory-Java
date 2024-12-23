package gr.aueb.cf.ch12;


/**
 * Data Class
 * POJO (Plain Old Java Object)
 * Java Bean
 */

public class Student {

    private static int studentsCount = 0;

    private int id;
    private String firstname;
    private String lastname;



    public Student() {
       studentsCount ++;
    }

    //Overloaded Constructor
    public Student(int id , String firstname , String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount ++ ;
    }


    public static int getStudentsCount () {
        return studentsCount;
    }

    public int getId () {
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFirstname () {
        return firstname;
    }

    public void setFirstname (String firstname) {
        this.firstname = firstname;
    }


    public String getLastname () {
        return lastname;
    }

    public void setLastname (String lastname) {
        this.lastname = lastname;
    }
}


//Public : τα πεδια της κλασης ειναι προσπελασιμα απο παντου
// Private : τα πεδια της κλασης οτι ειναι προσπελασιμα μονο στην ιδια την κλαση
// Protected : String lastname; //τα πεδια  της κλασης ειναι προσπελασιμα απο την ιδια τη κλαση και απο υποκλασεις αυτής της κλασης σε μια ιεραρχεια κληρονομικοτητας
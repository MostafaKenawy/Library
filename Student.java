package project.pkg1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static project.pkg1.Library_Manager.Borrowed_Magazines;
import static project.pkg1.Library_Manager.Borrowed_booklets;
import static project.pkg1.Library_Manager.Borrowed_books;
import static project.pkg1.Library_Manager.list;
import static project.pkg1.Library_Manager.over_period_borrowedBookName;

public class Student extends Person {

     public static LocalDate d1 = LocalDate.now();
    public static LocalDate d2;
    public static ArrayList<String> Borrowed_books = new ArrayList<String>();
    public static ArrayList<String> Borrowed_Magazines = new ArrayList<String>();
    public static ArrayList<String> Borrowed_booklets = new ArrayList<String>();

    private int S_id;

    public Student() {
    }

    public Student(String name, int age, String Address, int phone, int S_id) {
        super(name, age, Address, phone);
        this.S_id = S_id;
    }

    public void setS_id(int S_id) {
        this.S_id = S_id;
    }

    public int getS_id() {
        return S_id;
    }

    public void Search(String name) {
        boolean find = false;
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(name)) {
                find = true;
                result += "  Name  :" + list.get(i).name + "\n" + "   Book ID   :" + list.get(i).id + "\n";
            }
        }
        if (find) {
            JOptionPane.showMessageDialog(null, result);
        } else {
            JOptionPane.showMessageDialog(null, "Book is not exist");
        }
    }

    public void show_list() {
        String listing = "";

        for (int i = 0; i < list.size(); i++) {
            listing += (i + 1) + "-" + "book name:  " + list.get(i).name + "\n" + "Book ID:  " + list.get(i).id + "\n" + " Version : " + list.get(i).version + "\n"
                    + " Stock:  " + list.get(i).stock + "\n";
        }
        JOptionPane.showMessageDialog(null, listing);
    }

    public static void Borrow(String book_name, String option) {
      //  Date = Date1;
        boolean find = false, Ok = false;
        String search_result = "";
        String listing = "";

        String name1 = book_name;

        // int v = version;
        // int p = price;
        // int S = stock;
        switch (option) {
            case "1":
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).name.equals(name1)) {
                        find = true;
                        search_result += "Book Name  :" + list.get(i).name
                                + "\n" + "Book Stock  :" + list.get(i).stock + "\n"
                                + "Book ID   :" + list.get(i).id + "\n";
                        Borrowed_books.add(name1);
                        if (find) {

                            JOptionPane.showMessageDialog(null, "You borrow Book ! :\n" + search_result);
                        } else {
                            JOptionPane.showMessageDialog(null, "Book is not avilable .");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "book is not exist .");
                    }

                }
                break;
            case "2":
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).name.equals(name1)) {
                        find = true;
                        search_result += "Book Name  :" + list.get(i).name
                                + "\n" + "Book Stock  :" + list.get(i).stock + "\n"
                                + "Book ID   :" + list.get(i).id + "\n";
                        Borrowed_booklets.add(name1);
                        if (find) {

                            JOptionPane.showMessageDialog(null, "You borrow Booklet ! :\n" + search_result);
                        } else {
                            JOptionPane.showMessageDialog(null, "Booklet is not avilable .");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "booklet is not exist .");
                    }

                }
                break;
            case "3":
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).name.equals(name1)) {
                        find = true;
                        search_result += "Book Name  :" + list.get(i).name
                                + "\n" + "Book Stock  :" + list.get(i).stock + "\n"
                                + "Book ID   :" + list.get(i).id + "\n";
                        Borrowed_Magazines.add(name1);
                        if (find) {

                            JOptionPane.showMessageDialog(null, "You borrow Magazine ! :\n" + search_result);
                        } else {
                            JOptionPane.showMessageDialog(null, "Magazine  is not avilable .");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Magazine  is not exist .");
                    }
                }
                break;

                
                
        }

    }
    public static void ReturnDate(LocalDate d1, LocalDate d2, String book_name, String option ) {
        switch (option){
            case "1":
        long noOfDaysBetween = ChronoUnit.DAYS.between(d1, d2);
        int total_fine = 0;
        boolean ok = false;
        boolean flag = false;
        for (int i = 0; i < Borrowed_books.size(); i++) {
            if (Borrowed_books.get(i).equals(book_name)) {
                ok = true;
                flag=true;
            }
        }
        if (ok) {
            if (flag) {
                if (noOfDaysBetween > 20) {
                    total_fine += 5;
                    over_period_borrowedBookName.add(book_name);

                    JOptionPane.showMessageDialog(null, "You must pay a fine because of your delay which is " + total_fine + " pounds .");
                } else {
                    JOptionPane.showMessageDialog(null, "Thank you for bringing the book on time .");
                }
            } else {
                JOptionPane.showMessageDialog(null, "The book has not been borrowed before to be returned.");

            }
        } else {
            JOptionPane.showMessageDialog(null, "The book details is Wrong ");

        }
        break;
        case "2":
        long noOfDaysBetween1 = ChronoUnit.DAYS.between(d1, d2);
        int total_fine2 = 0;
        boolean ok1 = false;
        boolean flag1 = false;
        for (int i = 0; i < Borrowed_booklets.size(); i++) {
            if (Borrowed_booklets.get(i).equals(book_name)) {
                ok = true;
                flag1=true;
            }
        }
        if (ok1) {
            if (flag1) {
                if (noOfDaysBetween1 > 12) {
                    total_fine2 += 5;
                    over_period_borrowedBookName.add(book_name);

                    JOptionPane.showMessageDialog(null, "You must pay a fine because of your delay which is " + total_fine2 + " pounds .");
                } else {
                    JOptionPane.showMessageDialog(null, "Thank you for bringing the book on time .");
                }
            } else {
                JOptionPane.showMessageDialog(null, "The book has not been borrowed before to be returned.");

            }
        } else {
            JOptionPane.showMessageDialog(null, "The book details is Wrong ");

        }
        break;
        case "3":
        long noOfDaysBetween2 = ChronoUnit.DAYS.between(d1, d2);
        int total_fine1 = 0;
        boolean ok2 = false;
        boolean flag2 = false;
        for (int i = 0; i < Borrowed_Magazines.size(); i++) {
            if (Borrowed_Magazines.get(i).equals(book_name)) {
                ok = true;
                flag2 =true;
            }
        }
        if (ok2) {
            if (flag2) {
                if (noOfDaysBetween2 > 12) {
                    total_fine1 += 5;
                    over_period_borrowedBookName.add(book_name);

                    JOptionPane.showMessageDialog(null, "You must pay a fine because of your delay which is " + total_fine1 + " pounds .");
                } else {
                    JOptionPane.showMessageDialog(null, "Thank you for bringing the book on time .");
                }
            } else {
                JOptionPane.showMessageDialog(null, "The book has not been borrowed before to be returned.");

            }
        } else {
            JOptionPane.showMessageDialog(null, "The book details is Wrong ");

        }
        break;

    }
}

}

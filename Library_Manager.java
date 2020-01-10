package project.pkg1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
//import static project.pkg1.Project1.Library;

public class Library_Manager extends Person {

    public static LocalDate d1 = LocalDate.now();
    public static LocalDate d2;
    public static ArrayList<Publication> list = new ArrayList<Publication>();
    public static ArrayList<String> Borrowed_books = new ArrayList<String>();
    public static ArrayList<String> Borrowed_Magazines = new ArrayList<String>();
    public static ArrayList<String> Borrowed_booklets = new ArrayList<String>();
    public static ArrayList<String> over_period_borrowedBookName = new ArrayList<String>();
    private String password;
    private int i;
    //private Book[] ar;

    public Library_Manager() {
    }
    Scanner inp = new Scanner(System.in);

    public Library_Manager(String name, int age, String Address, int phone, String password) {
        super(name, age, Address, phone);

        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public static void Add(String book_name, int id, int version, int price, int stock, String option) {
        String listing = "";

        String name = book_name;
        int f = id;
        int v = version;
        int p = price;
        int S = stock;
        String n = null;
        String e1 = option;
        switch (e1) {
            case "1":
                list.add(new Book(name, f, v, p, S));
                for (int i = 0; i < list.size(); i++) {
                    listing += "You Just add Book ! " + "\n" + "Name of Book :  " + list.get(i).name + "\n" + " ID:  " + list.get(i).id + "\n" + "Version:  " + list.get(i).version + "\n"
                            + " price:  " + list.get(i).price + "\n" + " Stock:  " + list.get(i).stock + "\n";
                }
                break;
            case "2":
                list.add(new Booklet(name, f, v, p, S));
                for (int i = 0; i < list.size(); i++) {
                    listing += "You Just add Booklet " + "\n" + "Name of Booklet :  " + list.get(i).name + "\n" + " ID:  " + list.get(i).id + "\n" + "Version:  " + list.get(i).version + "\n"
                            + " price:  " + list.get(i).price + "\n" + " Stock:  " + list.get(i).stock + "\n";
                }
                break;
            case "3":
                list.add(new Magazine(name, f, v, p, S));
                for (int i = 0; i < list.size(); i++) {
                    listing += "You Just add Magazine " + "\n" + "Name of  Magazine :  " + list.get(i).name + "\n" + " ID:  " + list.get(i).id + "\n" + "Version:  " + list.get(i).version + "\n"
                            + " price:  " + list.get(i).price + "\n" + " Stock:  " + list.get(i).stock + "\n";
                }
                break;
        }

        JOptionPane.showMessageDialog(null, listing);
        listing = "";
    }

    public static void Delete(String name) {
        String listing = "";

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(name)) {
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            listing += "Deleted !" + "\n" + " name:  " + list.get(i).name + "\n" + "Book ID:  " + list.get(i).id;
        }
        JOptionPane.showMessageDialog(null, listing);
        listing = "";
    }

    public static void Search(String name) {
        boolean find = false;
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(name)) {
                find = true;
                result += "  Name  :" + list.get(i).name + "\n" + "   Book ID   :" + list.get(i).id + "\n" + " Stock:  " + list.get(i).stock + "\n"
                        + " price:  " + list.get(i).price + "\n";
            }
        }
        if (find) {
            JOptionPane.showMessageDialog(null, result);
        } else {
            JOptionPane.showMessageDialog(null, "Book is not exist");
        }
    }

    public static void Modify(String old_book_name, String new_book_name, int id, int version, int price, int stock) {
        String listing = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(old_book_name)) {
                list.get(i).name = new_book_name;
                list.get(i).stock = stock;
                list.get(i).id = id;
                list.get(i).version = version;
                list.get(i).price = price;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            listing += "Modifed Comleted !n" + " Name:  " + list.get(i).name + "\n" + "Book ID:  " + list.get(i).id + "\n" + "Version:  " + list.get(i).version + "\n"
                    + " price:  " + list.get(i).price + "\n" + " Stock:  " + list.get(i).stock + "\n";
        }

        JOptionPane.showMessageDialog(null, listing);
        listing = "";
    }

    public static void show_list() {
        String listing = "";

        for (int i = 0; i < list.size(); i++) {
            listing += (i + 1) + "-" + "book name:  " + list.get(i).name + "\n" + "Book ID:  " + list.get(i).id + "\n" + " Version : " + list.get(i).version + "\n"
                    + " Stock:  " + list.get(i).stock + "\n";
// don't forget to add stock of book 
        }
        JOptionPane.showMessageDialog(null, listing);
    }

    public static void Borrow_list() {
        String listing = "";
        String listing1 = "";
        String listing2 = "";

        for (int i = 0; i < Borrowed_books.size(); i++) {
            listing += (i + 1) + "-" + " Name:  " + list.get(i).name + "\n" + "Book ID:  " + list.get(i).id + "\n" + " Version : " + list.get(i).version + "\n"
                    + " Stock:  " + list.get(i).stock + "\n";
      }
        for (int k = 0; k < Borrowed_booklets.size(); k++) {
            listing1 += (k + 1) + "-" + " Name:  " + list.get(k).name + "\n" + "Book ID:  " + list.get(k).id + "\n" + " Version : " + list.get(k).version + "\n"
                    + " Stock:  " + list.get(k).stock + "\n";
      }
        for (int n = 0; n < Borrowed_Magazines.size(); n++) {
            listing2 += (n + 1) + "-" + " Name:  " + list.get(n).name + "\n" + "Book ID:  " + list.get(n).id + "\n" + " Version : " + list.get(n).version + "\n"
                    + " Stock:  " + list.get(n).stock + "\n";
// don't forget to add stock of book 
        }
        JOptionPane.showMessageDialog(null, listing);
        JOptionPane.showMessageDialog(null, listing1);
        JOptionPane.showMessageDialog(null, listing2);

    }

    public static void Show_over_period_books() {
        String Listing = "";
        for (int i = 0; i < over_period_borrowedBookName.size(); i++) {
            Listing += (i + 1) + "Name :" + over_period_borrowedBookName.get(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, Listing);
    }

}

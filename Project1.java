package project.pkg1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Project1 {

    public static LocalDate d1 = LocalDate.now();
    public static LocalDate d2;
    public static ArrayList<Publication> list = new ArrayList<Publication>();

    public static String role;

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "This the Library Managment System " + "\n" + "Please Press ok to Continue ");
        Scanner inp = new Scanner(System.in);
        boolean open = true;
        while (open) {
            role = JOptionPane.showInputDialog("chosse your role  :\n"
                    + "1- Library Manager .\n"
                    + "2- Student . \n"
                    + "3- close program .\n");

            switch (role) {
                case "1":
                    JOptionPane.showMessageDialog(null, "HELLO Boss," + "\n" + "Press ok and confirm your details  ");
                    boolean flag1 = true;
                    String name = JOptionPane.showInputDialog("Enter your name: ");
                    String Address = JOptionPane.showInputDialog("Enter Your User name : ");
                    String Password = JOptionPane.showInputDialog("Enter Your Password : ");
                    int phone = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Phone : "));
                    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age :"));

                    Library_Manager L1 = new Library_Manager(name, age, Address, phone, Password);

                    while (flag1) {
                        String e1 = JOptionPane.showInputDialog("Choose number :\n"
                                + "1- add\n"
                                + "2- delete\n"
                                + "3- search\n"
                                + "4- Modify\n"
                                + "5- Show list\n"
                                + "6- Show Borrowed list \n"
                                + "7- Show over period books \n"
                                + "8- Back to main list\n");

                        switch (e1) {
                            case "1":
                                String b1 = JOptionPane.showInputDialog("Choose number :\n"
                                        + "1- add book . \n"
                                        + "2- add booklet . \n"
                                        + "3- add Magazine . \n");
                                switch (b1) {

                                    case "1":
                                        String Book_name = JOptionPane.showInputDialog("Enter the book_name YOU want to add: ");
                                        int book_id = Integer.parseInt(JOptionPane.showInputDialog("Enter the book ID: "));
                                        int book_version = Integer.parseInt(JOptionPane.showInputDialog("Enter the book version: "));
                                        int book_price = Integer.parseInt(JOptionPane.showInputDialog("Enter the book price: "));
                                        int book_stock = Integer.parseInt(JOptionPane.showInputDialog("Enter the book stock: "));

                                        Library_Manager.Add(Book_name, book_id, book_version, book_price, book_stock, b1);
                                        break;
                                    case "2":
                                        String Booklet_name = JOptionPane.showInputDialog("Enter the booklet_name YOU want to add: ");
                                        int Booklet_id = Integer.parseInt(JOptionPane.showInputDialog("Enter the booklet ID: "));
                                        int booklet_version = Integer.parseInt(JOptionPane.showInputDialog("Enter the booklet version: "));
                                        int booklet_price = Integer.parseInt(JOptionPane.showInputDialog("Enter the booklet price: "));
                                        int booklet_stock = Integer.parseInt(JOptionPane.showInputDialog("Enter the booklet stock: "));

                                        Library_Manager.Add(Booklet_name, Booklet_id, booklet_version, booklet_price, booklet_stock, b1);
                                        break;
                                    case "3":
                                        String Magazine_name = JOptionPane.showInputDialog("Enter the Magazine_name YOU want to add: ");
                                        int Magazine_id = Integer.parseInt(JOptionPane.showInputDialog("Enter the Magazine  ID: "));
                                        int Magazine_version = Integer.parseInt(JOptionPane.showInputDialog("Enter the Magazine version: "));
                                        int Magazine_price = Integer.parseInt(JOptionPane.showInputDialog("Enter the Magazine price: "));
                                        int Magazine_stock = Integer.parseInt(JOptionPane.showInputDialog("Enter the Magazine stock: "));

                                        Library_Manager.Add(Magazine_name, Magazine_id, Magazine_version, Magazine_price, Magazine_stock, b1);
                                        break;

                                }
                                break;
                            case "2":
                                String b2 = JOptionPane.showInputDialog("Enter the name of what you want to delete :\n");
                                Library_Manager.Delete(b2);
                                break;
                            case "3":

                                String search_book = JOptionPane.showInputDialog("Enter the book name YOU want to Search about: ");
                                Library_Manager.Search(search_book);
                                break;

                            case "4": {

                                String Book_name = JOptionPane.showInputDialog("Enter the book_name YOU want to Modify: ");
                                String NEW_Book_name = JOptionPane.showInputDialog("Enter the New book_name : ");
                                int book_id = Integer.parseInt(JOptionPane.showInputDialog("Enter the book new ID: "));
                                int book_version = Integer.parseInt(JOptionPane.showInputDialog("Enter the new book version: "));
                                int book_price = Integer.parseInt(JOptionPane.showInputDialog("Enter the book new price: "));
                                int book_stock = Integer.parseInt(JOptionPane.showInputDialog("Enter the book new stock: "));

                                Library_Manager.Modify(Book_name, NEW_Book_name, book_id, book_version, book_price, book_stock);
                            }
                            break;

                            case "5": {
                                Library_Manager.show_list();
                            }
                            break;
                            case "6":

                                Library_Manager.Borrow_list();
                                break;
                                case "7":
                                    Library_Manager.Show_over_period_books();
                            case "8":
                                flag1 = false;
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Please enter number from the list: ");
                        }
                    }

                    break;

                case "2":
                    boolean flag2 = true;
                    JOptionPane.showMessageDialog(null, "HELLO Student ," + "\n" + "Press ok and confirm your details  ");
                    String Student_name = JOptionPane.showInputDialog("Enter your name: ");
                    String Student_Adress = JOptionPane.showInputDialog("Enter Your Adress: ");
                    int Student_phone = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Phone : "));
                    int Student_age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age : "));
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Your id : "));

                    Student s = new Student(Student_name, Student_age, Student_Adress, Student_phone, id);
                    while (flag2) {
                        String e2 = JOptionPane.showInputDialog("Choose number :\n"
                                + "1- search about book\n"
                                + "2- borrow book . \n"
                                + "3- Show List . \n"
                                + "4- Back to main list\n"
                        );

                        switch (e2) {// for student function

                            case "1":// to search 
                                String search_book = JOptionPane.showInputDialog("Enter the book name YOU want to Search about: ");
                                Library_Manager.Search(search_book);
                                break;

                            case "2":

                                String b1 = JOptionPane.showInputDialog("Choose number :\n"
                                        + "1- Borrow book . \n"
                                        + "2- Borrow booklet . \n"
                                        + "3- Borrow Magazine . \n");
                                  int days = Integer.parseInt(JOptionPane.showInputDialog("Enter Days : "));
                                        int years = Integer.parseInt(JOptionPane.showInputDialog("Enter years : "));
                                        int month = Integer.parseInt(JOptionPane.showInputDialog("Enter month : "));
                                        d1 = LocalDate.of(years, month, days);
                                switch (b1) {
                                    case "1":
                                      
                                        String book_name = JOptionPane.showInputDialog("Enter the book name YOU want to Borrow : ");
                                        Student.Borrow(book_name, b1);
                                        
                                        break;

                                    case "2":

                                        String booklet_name = JOptionPane.showInputDialog("Enter the booklet name YOU want to Borrow : ");
                                        
                                       
                                        Student.Borrow(booklet_name, b1);
                                        break;
                                    case "3":
                                        String Magazine_name = JOptionPane.showInputDialog("Enter the Magazine name YOU want to Borrow : ");
                                        Student.Borrow(Magazine_name, b1);
                                        break;
                                }

                                break;
                             case "3":
                                  String b2 = JOptionPane.showInputDialog("Choose number :\n"
                                        + "1- Return  book . \n"
                                        + "2- Return  booklet . \n"
                                        + "3- Return  Magazine . \n");
                                  switch (b2){
                                      case "1":
                                           String Book_name = JOptionPane.showInputDialog("Enter the Magazine name YOU want to return : ");
                                            Student.ReturnDate(d1, d2,Book_name, b2);
                                          break;
                                      case "2":
                                           String Booklet_name = JOptionPane.showInputDialog("Enter the Magazine name YOU want to return : ");
                                           Student.ReturnDate(d1, d2,Booklet_name, b2);
                                          break;
                                      case"3":
                                           String Magazine_name = JOptionPane.showInputDialog("Enter the Magazine name YOU want to return : ");
                                           Student.ReturnDate(d1, d2, Magazine_name, b2);
                                          break;
                                  }
                                 break;
                            case "4":

                                Library_Manager.show_list();
                                break;
                            case "5":
                                flag2 = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Please enter number from the list: ");

                        }

                    }
                    break;
                case "3": {
                    open = false;
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Please enter number from the list: ");

                }
            }
        }
    }
}

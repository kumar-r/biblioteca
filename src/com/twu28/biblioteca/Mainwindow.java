package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 12/7/12
 * Time: 8:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Mainwindow {
    static  OutputDevice outputit=new OutputDevice();
    static InputDevice inputit=new InputDevice();
    static UserDatabase UDB=new UserDatabase();
    static Library library=new Library();
    BookCollection bookCollection = new BookCollection();
    int selectedMenuItem;
    static User user=new User();
    int index=-1;

    public static void main(String[] args){
      Mainwindow Main=new Mainwindow();
      library.ShowWelcomeScreen();
      Main.selectFromDisplay();
    }

    public void selectFromDisplay() {
            while (true) {

                 library.DisplaymainMenu();
                 selectedMenuItem = user.SelectMenuOption(inputit);
                if (selectedMenuItem == 1) {
                   library.ShowBooksInLibrary(bookCollection);
                }
                else if (selectedMenuItem==2){
                    outputit.output("Please Enter the ID of the book to reserve:\t");
                    int bookId= inputit.readint();
                    System.out.println(bookId);
                    library.reserveABookbyBookid(bookId,bookCollection,user);
                }
                else if(selectedMenuItem==3){
                  if(user.ReturnReservedBook(bookCollection))
                        outputit.output("Thank You: Your Book has been returned Successfully");
                   else
                        outputit.output("Sorry: You don't have any Reserved Book to return");
                }
                else if(selectedMenuItem==4){
                        if(index!=-1)
                               outputit.output("your library-Id is\t"+UDB.users.get(index).userLibraryId()+"\n");
                        else
                               outputit.output("Please talk to Librarian.\nThank you.\n");
                }
                else if(selectedMenuItem==5){
                    MovieCollection movieCollection=new MovieCollection();
                     if(index==-1){
                         outputit.output("you should be logged in to view list of movies");
                         outputit.output("enter your LIBRARY-ID to login");
                         outputit.output("username:");
                         int username=inputit.readint();
                         outputit.output("password:");
                         int password=inputit.readint();
                         index=library.UserLogin(UDB,username,password);
                         if(index==-1){
                             outputit.output("Sorry: INcorrect username or password");
                         }
                         else{
                             outputit.output("login successfull :)");
                             library.ShowMoviesInLibrary(movieCollection);
                         }
                     }
                     else{
                           outputit.output("you are already logged in.");
                           System.out.println("user index is: "+(index+1)+"\n");
                           library.ShowMoviesInLibrary(movieCollection);
                     }
                 }

                else if (selectedMenuItem==6) {
                    outputit.output("Come Back Again to Biblioteca.\n...Thank you...\n");
                    System.exit(0);
                }

                else
                    outputit.output("Select a valid option!!!\n1");
            }

    }
}


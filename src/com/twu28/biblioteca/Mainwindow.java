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
    private static UserDatabase UD=new UserDatabase();
    int selectedMenuItem;
    //private static BookCollection bookC=new BookCollection();


    public static void main(String[] args){
      Mainwindow Main=new Mainwindow();
      Main.ShowWelcomeScreen();
      //outputit.output("enter your library ID\n");
      //int libnum= inputit.readint();

      Main.selectFromDisplay();
    }

    public int DisplayListOfMenuOptions(OutputDevice outputdevice) {
        UsermenuOption UMO=new UsermenuOption();
        UMO.displayMenuOptions(outputdevice);
        return 99;
    }

    public void ShowWelcomeScreen() {
        Welcome splash = new Welcome(4000);
        System.out.println("WelCome To Biblioteca");
        splash.showSplashAndExit();
        //System.out.println("Welcome to BIBLIOTECA");
    }
    public void selectFromDisplay() {

            while (true) {

                 DisplayListOfMenuOptions(outputit);
                 selectedMenuItem = inputit.readint();
                if (selectedMenuItem == 1) {
                    BookCollection bookCollection = new BookCollection();
                    String output = "List of all the Books:\n";
                    for (int i = 0; i < bookCollection.books.size(); i++) {
                        String book = bookCollection.books.get(i).bookName;
                        output += (i + 1) + "." + book + "\n";
                    }
                    output += "\n";
                    outputit.output(output);
                }
                else if (selectedMenuItem==2){
                    boolean bookexists=false;
                    outputit.output("Please Enter the name of the book to reserve:\t");

                    String bookName=inputit.readInput();
                    BookCollection bookCollection = new BookCollection();
                   for(int i=0;i<bookCollection.books.size();i++){
                    if(bookCollection.books.get(i).bookName==bookName)
                          bookexists=true;
                    }

                      if(bookexists==true)
                        outputit.output("Thank You! Enjoy the book.\n");
                    else
                       outputit.output("Sorry we don't have that book yet");
                }


                else if(selectedMenuItem==3){

                    outputit.output("SORRY!!!this feature will be implemented soon.\n");
                }
                else if(selectedMenuItem==4){

                        outputit.output("Please talk to Librarian.\nThank you.\n");
                }

                else if (selectedMenuItem ==5) {
                    outputit.output("Come Back Again to Biblioteca.\n...Thank you...\n");
                    System.exit(0);
                }

                else
                    outputit.output("Select a valid option!!!\n1");
            }

        }

}



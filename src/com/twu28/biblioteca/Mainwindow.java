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
    BookCollection bookCollection = new BookCollection();
    int selectedMenuItem;
    static User user=new User();
    int index=-1;
    boolean login=false;

    public static void main(String[] args){
      Mainwindow Main=new Mainwindow();
      Main.ShowWelcomeScreen();
      Main.selectFromDisplay();
    }

    public int DisplayListOfMenuOptions(OutputDevice outputdevice) {
        UsermenuOption UMO=new UsermenuOption();
        UMO.displayMenuOptions(outputdevice);
        return 99;
    }

    public boolean ShowWelcomeScreen() {
       Welcome splash = new Welcome(4000);
        System.out.println("WelCome To Biblioteca");
        try{
            splash.showSplashAndExit();
        }
        catch (RuntimeException ie){
            System.out.println("Some error in Running Graphical interface"+ ie);
        }
          return true;
    }
    public void selectFromDisplay() {
        int libraryid;

            while (true) {

                 DisplayListOfMenuOptions(outputit);
                 selectedMenuItem = user.SelectMenuOption();
                 if (selectedMenuItem == 1) {
                   bookCollection.DisplayListOfBooks(outputit);
                }
                else if (selectedMenuItem==2){
                    boolean bookexists=false;
                    outputit.output("Please Enter the ID of the book to reserve:\t");
                     int bookId= inputit.readint();

                     System.out.println(bookId);
                     bookexists=bookCollection.IsBookAvailable(bookId);
                    if(bookexists){
                        user.SetEnteredBookAsBookReserved(bookId,bookCollection);
                        outputit.output("Thank You! Enjoy the book.\n");
                      }
                    else
                       outputit.output("Sorry we don't have that book yet.");
                }


                else if(selectedMenuItem==3){
                  if(user.ReturnReservedBook())
                        outputit.output("Thank You: Your Book has been returned Successfully");

                     else
                        outputit.output("Sorry: You don't have any Reserved Book to return");
                }
                else if(selectedMenuItem==4){

                        outputit.output("Please talk to Librarian.\nThank you.\n");
                }
                 else if(selectedMenuItem==5){

                     if(index==-1){
                     outputit.output("you should be logged in to view list of movies");
                     outputit.output("enter your library-Id to login");

                     libraryid=inputit.readint();
                      for(int i=0;i<UDB.users.size();i++){
                          if(libraryid==UDB.users.get(i).getlibId()){
                              login=true;
                              UDB.users.get(i).setLoggedin(login);
                              index=i+1;
                          }
                      }

                     }
                      else{
                             outputit.output("you are logged in.");
                         }

                     if(login){
                         System.out.println("user index is: "+index+"\n");
                              MovieCollection movieCollection=new MovieCollection();
                              movieCollection.DisplayListOfMovies(outputit);
                     }

                     else
                           outputit.output("your are not a member: SORRY!!!!");

                 }

                else if (selectedMenuItem ==6) {
                    outputit.output("Come Back Again to Biblioteca.\n...Thank you...\n");
                    System.exit(0);
                }

                else
                    outputit.output("Select a valid option!!!\n1");
            }

        }

}


public class CreateWebSource
{
  public static void main(String[] args) throws Exception
  {
    System.out.println( "" );
 
    try
    {
      if ( args == null || args.length != 4 )
      {
       #fe        // Get web service URL from command-line arguments
        String webServiceURL = args[0];
        System.out.println( "Using web service URL \"" + webServiceURL + "\"\n" ); 
        
        // Get username and password
        String userName = args[1];
        String password = args[2];
ature201 chnage by sathvi
#end feature 201

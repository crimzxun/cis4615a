// Rule 07. Exceptional Behavior (ERR)
// ERR00-J. Do not suppress or ignore checked exceptions

try 
{
  //...
} 
catch (IOException ioe) 
{
  ioe.printStackTrace();
}
# Alphabet
import java.io.*;
import java.util.*;
public class Alphabet
{
  public static void main(String args[])
  {
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Character");
    ch=sc.nextInt().charAt(0);
    if((ch>='a' && ch<='z')) || (ch>='A' && ch<='Z'))
    {
      System.out.println(ch+"is an Alphabet");
    }
    else
    {
      System.out.println(ch+"is not an Alphabet");
      }
     }
   }  

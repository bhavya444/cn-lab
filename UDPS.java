import java.net.*;     
import java.util.Date;
import java.util.*;
import java.io.*;

public class UDPS
{
  public static void main(String args[]) throws Exception   
  {
    DatagramSocket dsock = new DatagramSocket();     
    InetAddress address = InetAddress.getLocalHost( ); 
    System.out.println("Server is ready");
	
    while(true)                          
    {    
     Thread.sleep(1000);                                               
     
    DataInputStream din=new DataInputStream(System.in);
     String s2=din.readLine();

     
     byte arr[] = s2.getBytes( );
     DatagramPacket dpack = new DatagramPacket(arr, arr.length, address, 2000);
     dsock.send(dpack);                                             
    }
  }
}

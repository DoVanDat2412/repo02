package .vscode;

public class App0402 {
    class MyNumber implements Runnable 
{   private String threadName; 
    public MyNumber(String name){threadName=name; } 
    public void run()   // Cài đặt phương thức run của Runnable 
    {   int i=0; 
        while(i<10) 
        { 
            System.out.println(threadName+" "+i);            
            i++; 
        } 
    } 
} 
public class App0402 
{ 
    public static void main(String[]args) 
    {
}

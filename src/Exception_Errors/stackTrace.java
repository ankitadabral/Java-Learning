package Exception_Errors;
// Multiple SERIES OF EXCEPTIONS
public class stackTrace {
    public static void main(String[] args){
       //  level1();
        // The output will show an exception along with a stack trace,
        // which shows the sequence of method calls that led to the exception.
        // *   STACK TRACE : A stack trace is a detailed report that tells you where an exception occurred and the sequence of method calls that led to it.


        // To print the same output which we are getting by above we can get it by try catch
        try{
            level1();
        }catch(Exception o){
            o.printStackTrace();
        }
    }

    public static void level3(){
        int[] array = new int[5];
        array[5] = 10; // here we will get array out of bound exception as we are setting value to index 5
    }

    public static void level2(){
        level3();
    }

    public static void level1() {
        level2();
    }


}

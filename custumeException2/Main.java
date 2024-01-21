public class Main {
    public static void main(String[] args) {
        try{
            throw new MyException("my Exception massage");
        }
        catch (MyException ex){
            System.out.println("Exceptions has been caught");
           // System.out.println(ex.getMessage());
        }
    }
}
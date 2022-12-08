public class finalDemo1 {
    final int a = 200;
    void run()
    {
        System.out.println("We cannot change the value of a final variable");
    }    

    public static void main(String[] args) {
        finalDemo1 ob = new finalDemo1();
        ob.run();
    }
}

public class CommandLine
{
    public static void main(String[] args) {
        System.out.println("The given command line arguments are: ");
        for (String str : args) {
            System.out.println(str);
        }
    }
}
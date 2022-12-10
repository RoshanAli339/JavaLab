package week3;
class MyTime
{
    MyTime(int h, int m, int s, String meridian)
    {
        System.out.println("Time is: " + h + ":" + m + ":" + s + " " + meridian);
    }

    MyTime(int h, int m, int s)
    {
        System.out.println("Time is: " + h + ":" + m + ":" + s);
    }

    public static void main(String[] args) {
        MyTime t1 = new MyTime(16, 34, 15);
        MyTime t2 = new MyTime(3, 34, 12, "AM");
    }
}
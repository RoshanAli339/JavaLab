package p2;

class Demo2 {
    public static void main(String[] args) {
        Protection2 p2 = new Protection2();
        OtherPackage ob = new OtherPackage();

        p2.msg();
        ob.msg();
    }    
}

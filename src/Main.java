public class Main {
    public  void  add(){
        int a=1;
        int b=2;
        System.out.println(a+b);
    }
    public void sub(){
        int a=1;
        int b=2;
        System.out.println(a-b);
    }
    public  void  mul(){
        int a=1;
        int b=2;
        System.out.println(a*b);
    }


    public static void main(String[] args) {

        Main main=new Main();
        main.add();
        main.sub();

        System.out.println("Hello, World!");
    }
}
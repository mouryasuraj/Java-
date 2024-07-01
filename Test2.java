class Main {

    int i = 5;

    public Main(int i){
    this.i=i; 
    }

    public Main(Test2 t) {
        this.i = t.i;
    }

}

public class Test2 extends Main {
    public Test2(int i){
        super(i);
    }
    public static void main(String[] args) {
        Test2 t1 = new Test2(10);
        // t1.i=10;
        Test2 t = new Test2(50);
        System.out.println(t.i);
    }

}
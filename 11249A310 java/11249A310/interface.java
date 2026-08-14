interface A {
    void showA();
}
interface B{
    void showB();
}
class C implements A,B {
    public void showA() {
        System.out.println("This is interface:A");
    }
    public void showB() {
        System.out.println("This is interface B");
    }
    public static void main(String[] args) {
        C obj =new C() ;
        obj.showA();
        obj.showB();
    }
}
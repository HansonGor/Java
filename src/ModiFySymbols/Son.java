package src.ModiFySymbols;

public class Son extends ModiFySymbols {

    public Son(String a) {
        super(a);
        //显示调用父类的构造函数，而且必须是第一行调用 
    }

    void m() {}
    
    public static void main(String[] args){
        Son empOne = new Son("Hanson");
        System.out.println(empOne.getFormat());
        System.out.println(empOne.BOXWIDTH);
        empOne.showDetails();
        System.out.println(empOne.limit);
    }
}
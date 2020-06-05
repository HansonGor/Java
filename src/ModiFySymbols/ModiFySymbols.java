package src.ModiFySymbols;

// 抽象类不能被new调用
public abstract class ModiFySymbols {
    String name;
    static final double weeks = 9.5;
    private String format = "HansonGor";
    protected final int BOXWIDTH = 42;
    protected static final int BOXWIDTH2 = 42;

    public transient int limit = 55; // 不会持久化
    public int b; // 持久化

    private volatile boolean active; // 共享内存

    public ModiFySymbols(String name) {
        this.name = name;
    }

    abstract void m(); // 抽象方法

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public synchronized void showDetails() {
        System.out.println("synchronized");
    }

    public void run()
    {
        active = true;
        while (active) // 第一行
        {
            // 代码
        }
    }
    public void stop()
    {
        active = false; // 第二行
    }

    public static void main(String[] arguments) {
        // // 方法体
        // System.out.println("ok");
        // System.out.println("weeks:" + weeks);
        // ModiFySymbols empOne = new ModiFySymbols("Hanson");
        // // empOne.setFormat("Gor");
        // String res = empOne.getFormat();
        // System.out.println("res" + res);
        // System.out.println(empOne.format);
    }

}

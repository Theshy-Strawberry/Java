package swift;

public class Singleton {
    private static Singleton instance=null;
    private Singleton(){
        System.out.println("my singleton");
    }
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
    public void del(){
    	System.out.println("nearBy");
    }
}

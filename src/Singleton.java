public class Singleton {

    private static Singleton instance;

    private String message;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(null == instance){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Singleton.class){
                if(null == instance) instance = new Singleton();
            }

        }
        return instance;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void businessLogic(){
        System.out.println("Executting Business Logic ...." + message);
    }
}

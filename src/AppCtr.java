import static java.lang.Thread.sleep;

public class AppCtr {
    public static void main(String[] args){
//        System.out.println(Singleton.getInstance().hashCode());
//        System.out.println(Singleton.getInstance().hashCode());
//        System.out.println(Singleton.getInstance().hashCode());
//        System.out.println(Singleton.getInstance().hashCode());
//        System.out.println(Singleton.getInstance().hashCode());

        System.out.println("---------------------------------------------");

//        new Thread(()->{ System.out.println(Singleton.getInstance().hashCode()); }).start();
//        new Thread(()->{ System.out.println(Singleton.getInstance().hashCode()); }).start();
//        new Thread(()->{ System.out.println(Singleton.getInstance().hashCode()); }).start();
//        new Thread(()->{ System.out.println(Singleton.getInstance().hashCode()); }).start();
//        new Thread(()->{ System.out.println(Singleton.getInstance().hashCode()); }).start();
//        new Thread(()->{ System.out.println(Singleton.getInstance().hashCode()); }).start();

        System.out.println("---------------------------------------------");

        new Thread(()->{
            Singleton t1 = Singleton.getInstance();
            t1.setMessage("t1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t1.businessLogic();
        }).start();

        new Thread(()->{
            Singleton t2 = Singleton.getInstance();
            t2.setMessage("t2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t2.businessLogic();
        }).start();

        new Thread(()->{
            Singleton t3 = Singleton.getInstance();
            t3.setMessage("t3");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t3.businessLogic();
        }).start();

        new Thread(()->{
            Singleton t4 = Singleton.getInstance();
            t4.setMessage("t4");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t4.businessLogic();
        }).start();
    }
}

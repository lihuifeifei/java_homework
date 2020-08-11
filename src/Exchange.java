public class Exchange {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Readfile readfileobj = new Readfile();
                try {
                    readfileobj.readfile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }
}

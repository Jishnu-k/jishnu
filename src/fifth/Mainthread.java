package fifth;


    class  Thread1 extends Thread {

        Samplethread s;

        Thread1(Samplethread s) {
            this.s = s;
        }

        @Override
        public void run() {
            s.display(5);
        }
    }

    class  Thread2 extends Thread {

        Samplethread s;

        Thread2(Samplethread s) {
            this.s = s;
        }

        @Override
        public void run() {
            s.display(100);
        }
    }

        public class Mainthread{
            public static void main(String[] args){
                Samplethread s=new Samplethread();
                Thread1 t1=new Thread1(s);
                Thread2 t2=new Thread2(s);
                t1.start();
                t2.start();
                Samplethread s1=new Samplethread();
                Thread1 t3=new Thread1(s1);
                Thread2 t4=new Thread2(s1);
                t3.start();
                t4.start();
            }
        }
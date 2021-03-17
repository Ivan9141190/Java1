public class testeratosthen {

    public boolean  testera  (int N) {
        boolean n = true;
        for (int i = 2; i <= N; i++) {
             n = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    n = false;
                    //break;
                }
            }
            if (n) {

                System.out.println(i + "  " + n);

            } else
                System.out.println(i + " " + n);

        }

        return n ;
    }
        public static void main (String[]args){
testeratosthen era = new testeratosthen();
            System.out.println(era.testera(99));

        }}


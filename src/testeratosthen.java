public class testeratosthen {

    public boolean  isSimple (int n) {
        boolean b = true;
        for (int i = 2; i <= n; i++) {
             b = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    //break;
                }
            }
            if (b) {
                System.out.println(i + "  " + b);
            } else
                System.out.println(i + " " + b);
        }
        return b ;
    }

        public static void main (String[]args){
testeratosthen era = new testeratosthen();
            System.out.println(era.isSimple(99));

        }}


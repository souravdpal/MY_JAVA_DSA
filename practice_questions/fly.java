
public class fly {

    public static void main(String[] args) {
        int r = 8;
        int c = 8;
        int n = 2;
        int n_r = 2;

        boolean strack = false;

        boolean sp = false;
        for (int i = 1; i <= r / 2; i++) {
            int spaces = c - n;
            int stars = n / 2;
            if (true) {
                if (strack == false && sp == false) {
                    strack = true;
                    for (int temp = 1; temp <= stars; temp++) {
                        System.out.print("*");

                    }

                }

                if (strack == true && sp == false) {
                    sp = true;
                    strack = false;
                    for (int stemp = 1; stemp <= spaces; stemp++) {
                        System.out.print(" ");
                    }
                }

                if (sp == true && strack == false) {
                    for (int stemp = 1; stemp <= stars; stemp++) {

                        System.out.print("*");

                    }

                }

                if (spaces == 0) {
                    System.err.println("");
                    boolean reverse = false;
                   

                    if (reverse == false) {
                        for (int in = 1; in <= c; in++) {
                            System.out.print("*");
                        }
                        reverse = true;

                    }
                    System.out.println("");
                    if (reverse == true) {
                        boolean strack_r = false;
                        boolean sp_r = false;

                        for (int let = 1; let <= r / 2; let++) {
                            int spaces_r = n_r;
                            int stars_r = c - n_r;

                            if (strack_r == false) {
                                strack_r = true;

                                for (int temp = 1; temp <= stars_r; temp++) {
                                    System.out.print("*");

                                }

                            }

                            if (sp_r == false) {
                                strack_r = false;
                                sp_r = true;

                                for (int stemp = 1; stemp <= spaces_r; stemp++) {
                                    System.out.print(" ");
                                }
                            }

                            if (sp_r == true && strack_r == false) {
                                for (int stemp = 1; stemp <= stars_r; stemp++) {

                                    System.out.print("*");

                                }

                            }
                            System.out.println("");
                            strack_r = false;
                            sp_r = false;
                            n_r = n_r + 2;
                        }

                    }
                    return;

                }
            }
            System.out.println("");
            strack = false;
            sp = false;
            n = n + 2;

        }
    }
}

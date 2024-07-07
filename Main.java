public class Main {
    public static void main(String[] args) {
        //Counts up to 30
        //for (int cnt = 0; cnt <=30; cnt++)
          // System.out.println(cnt);

        //Counts down from 30
        //for (int cnt = 30; cnt>=0; cnt--)
          // System.out.println(cnt);

        //Counts up by 3 from 0 to 18
        //for (int cnt = 0; cnt<=18; cnt= cnt+3)
         //System.out.println(cnt);

        //Counts down by 2 from 10 to 0
        //for (int cnt = 10; cnt>=0; cnt= cnt-2)
            //System.out.println(cnt);

        //Ascending
        //for (int row = 1; row<=5; row++){
        //    for (int column = 1; column<=row; column++){
          //      System.out.printf("*",column);
        //    }
            //System.out.println("");
        //}

        //Descending
        for (int row = 5; row>=1; row--){
            for (int column = 1; column<=row;column++ ){
                System.out.printf("*",column);
            }
            System.out.println("");
        }

        //5x5 Nested Loop
        //final int ROW= 5;
        //final int COL= 5;
        //for (int row = 0;row<ROW; row++)
        //{
            //for (int col = 0; col<COL; col++)
            //{
             //   System.out.printf("*", row*col);
            //}
            //System.out.println("");
        //}
    }
}
public class wayBack {
    public static void main(String[] args){
     int row = 1;
     int colunm = 1;
     int x;
     do {
         x = 4;
         do{
             System.out.print("");
             x--;
         } while (x >= row);
         colunm = 1;
         do {
             System.out.print(colunm + " ");
             colunm++;
         } while (colunm <= 10);
         System.out.println(" ");
         row++;
     } while (row <= 10);
     System.out.println(" ");
     colunm++;


        }


    }



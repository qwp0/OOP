public class Assignment3_10 {
    public static void main(String[] args){
        int [][] arr = new int[4][4];
        int count = 0;
        int temp1, temp2;

        while(count<10){
            temp1= (int)(Math.random()*4);
            temp2 = (int)(Math.random()*4);
            if(arr[temp1][temp2] == 0){
                arr[temp1][temp2] = (int)(Math.random()*10+1);
                count ++;
            }
        }
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }

}

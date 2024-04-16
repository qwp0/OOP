public class Assignment3_12 {
    public static void main(String[] args){
        int sum=0;
        for(String arg: args){
            try{
                int num = Integer.parseInt(arg);
                sum+=num;
            }
            catch (NumberFormatException error){
            }
        }
        System.out.println(sum);
    }
}

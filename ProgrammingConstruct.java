public class ProgrammingConstruct{
    public static void main(String args[]){
        for (int index = 0; index < args.length; index++) {
            System.out.println(args[index]);
        }

            if(args.length>0){
            System.out.print("Number of cities"+args.length);
            } 
            else{
                System.out.println("Please enter cities");
            }
            int value=args.length;

            while(value>0)
            {
                System.out.println(args[value-1]);
                value--;
            }
        }
    }

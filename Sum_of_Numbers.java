class Sum_of_Numbers{
    public static void main(String[] args){
        int list[] = new int[args.length];
        for(int i = 0; i < args.length; i++){
            list[i] = Integer.parseInt(args[i]);
        }
        for(int i = 0; i < args.length; i++){
            int hundred[] = new int[args.length];
            int ten[] = new int[args.length];
            if(list[i] == 0){
                System.exit(0);
            }else if(list[i] > 1200){
                System.out.println("the numbers have to be lower 1200");
                System.exit(0);
            }else{
                hundred[i] = list[i] / 100;
                list[i] -= hundred[i]*100;
                ten[i] = list[i] / 10;
                list[i] -= ten[i]*10;
                int sum;
                sum = hundred[i] + ten[i] + list[i];
                System.out.println(sum);
            }
        }
    }
}

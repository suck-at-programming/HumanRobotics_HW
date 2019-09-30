class Toggling_Cases{
    public static void main(String[] args){
        String[] s = new String[args.length];
        String[] output = new String[args.length];
        for(int i = 0; i < args.length; i++){
            s[i] = args[i];
        }
        if(args.length > 1200){
            System.out.println("lenght of String has to be lower than 1200");
            System.exit(0);
        }
        for(int i = 0; i < s.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < s[i].length(); j++){
                char c = s[i].charAt(j);
                if(Character.isUpperCase(c)){
                    c += 32;
                    sb.append(c);
                }
                else if(Character.isLowerCase(c)){
                    c -= 32;
                    sb.append(c);
                }else{
                    sb.append(c);
                }
            }
            output[i] =sb.toString();
        }
        for(int i =0; i < s.length; i++){
            System.out.print(output[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }
}

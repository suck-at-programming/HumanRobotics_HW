class Circle_in_a_Rectangle{
	public static void main(String[] args){
		int W = Integer.parseInt(args[0]);
		int H = Integer.parseInt(args[1]);
		int x = Integer.parseInt(args[2]);
		int y = Integer.parseInt(args[3]);
		int r = Integer.parseInt(args[4]);
		if(
		((x < 100) && (x > -100)) && ((y < 100) && (y > -100)) &&
		((W < 100) && (W > 0)) && ((H < 100) && (H > 0)) && ((r < 100) && (r > 0))
		   ){
			if(((x+r) < W) && ((y+r) < H)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}else{
			System.out.println("Rectangle argument and radius have to be within 0~100");
			System.out.println("each coordinate of the circle have to be within -100~100");
		}
	}
}
		
package ThucHanhFPT.LAP8;

public final class xPoly {

	public static final double sum(double x, double y) {
		return x + y;
	}
	
        public static final double max(double x, double y) {
		return (x > y) ? x : y;
	}
	
        public static final double min(double x, double y) {
		return (x < y) ? y : x;
	}
        
        public static void toUpperFirstChar(String s){
            
            String []str = s.split(" ");
            for (int i = 0; i < str.length; i++) {
                char firstChar = str[i].charAt(0);
                String upperFirstChar = String.valueOf(firstChar).toUpperCase(); // Chuyển về dạng chuỗi
                str[i] = upperFirstChar + str[i].substring(1);
            }
            for (int i = 0; i < str.length; i++) {
                s = String.join(str[i], " ");
            }
            
        }
}

package learnjava.Enumeration;

public enum Drinks {

	CAFE("cafe"), TEA("tra"), Cafefin(100);
        
	
	private String name;
        private int mark;
        
        private Drinks(int mark){
            this.mark = mark;
        }
	
	private Drinks(String name){ // phải có Cónstrucotr
		this.name = name; 
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
    //======================================================
        
        public int getMark(){
            return this.mark;
        }
        
        public void setMark(int mark) {
		this.mark = mark;
	}
}

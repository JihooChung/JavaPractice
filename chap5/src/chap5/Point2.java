package chap5;

	class Point2 {
		private int x, y;
		Point2(){};
		
		Point2(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		public void set(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public void showPoint() {
			System.out.println("(x,y) = (" + x + "," + y + ")");
		}
	}

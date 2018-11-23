package application;

public class Product {
		int skucode;
		String skuname;
		String skutype;
		float skuprice;
		int skuqua;
		
		public Product(int skucode, String skuname, String skutype, float skuprice, int skuqua) {
			this.skucode = skucode;
			this.skuname = skuname;
			this.skutype = skutype;
			this.skuprice = skuprice;
			this.skuqua = skuqua;
			}
		
		public Product() {
		}

		public int getSkucode() {
			return skucode;
		}

		public void setSkucode(int skucode) {
			this.skucode = skucode;
		}

		public String getSkuname() {
			return skuname;
		}

		public void setSkuname(String skuname) {
			this.skuname = skuname;
		}

		public String getSkutype() {
			return skutype;
		}

		public void setSkutype(String skutype) {
			this.skutype = skutype;
		}

		public float getSkuprice() {
			return skuprice;
		}

		public void setSkuprice(float skuprice) {
			this.skuprice = skuprice;
		}

		public int getSkuqua() {
			return skuqua;
		}

		public void setSkuqua(int skuqua) {
			this.skuqua = skuqua;
		}
		
		
}

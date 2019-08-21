public class ProductoInfo {

	private String titulo;
	private String id;
	private double price;
	private int stock;
	
	
	public ProductoInfo(String titulo, String id, double price, int stock) {
		super();
		this.titulo = titulo;
		this.id = id;
		this.price = price;
		this.stock = stock;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "ProductInfo [Título=" + titulo + ", ID=" + id + ", Precio=" + price + ", Stock=" + stock + "]";
	}
	
	
}




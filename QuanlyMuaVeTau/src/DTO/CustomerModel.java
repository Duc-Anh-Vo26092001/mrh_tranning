package DTO;

public class CustomerModel {
      private String SoCMND;
      private String Tenkhachhang;
      private String Gaden;
      private double Gia;
      
	  public CustomerModel(String soCMND, String tenkhachhang, String gaden, double gia) {
		super();
		SoCMND = soCMND;
		Tenkhachhang = tenkhachhang;
		Gaden = gaden;
		Gia = gia;
	}

	public String getSoCMND() {
		return SoCMND;
	}

	public void setSoCMND(String soCMND) {
		SoCMND = soCMND;
	}

	public String getTenkhachhang() {
		return Tenkhachhang;
	}

	public void setTenkhachhang(String tenkhachhang) {
		Tenkhachhang = tenkhachhang;
	}

	public String getGaden() {
		return Gaden;
	}

	public void setGaden(String gaden) {
		Gaden = gaden;
	}

	public double getGia() {
		return Gia;
	}

	public void setGia(double gia) {
		Gia = gia;
	}

	@Override
	public String toString() {
		return "CustomerModel [SoCMND=" + SoCMND + ", Tenkhachhang=" + Tenkhachhang + ", Gaden=" + Gaden + ", Gia="
				+ Gia + "]";
	}
	  
      
      
}

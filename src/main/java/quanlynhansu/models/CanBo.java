package quanlynhansu.models;

public class CanBo {
	private int soHieuCB;
	private String tenCB;
	private String dvCongTac;
	private String chucVuHienTai;

	public CanBo(int soHieuCB, String tenCB, String dvCongTac,
			String chucVuHienTai) {
		this.soHieuCB = soHieuCB;
		this.tenCB = tenCB;
		this.dvCongTac = dvCongTac;
		this.chucVuHienTai = chucVuHienTai;
	}

	public int getSoHieuCB() {
		return soHieuCB;
	}

	public void setSoHieuCB(int soHieuCB) {
		this.soHieuCB = soHieuCB;
	}

	public String getTenCB() {
		return tenCB;
	}

	public void setTenCB(String tenCB) {
		this.tenCB = tenCB;
	}

	public String getDvCongTac() {
		return dvCongTac;
	}

	public void setDvCongTac(String dvCongTac) {
		this.dvCongTac = dvCongTac;
	}

	public String getChucVuHienTai() {
		return chucVuHienTai;
	}

	public void setChucVuHienTai(String chucVuHienTai) {
		this.chucVuHienTai = chucVuHienTai;
	}

}

public class QuanLyPhanSo {
    PhanSo phanSo = new PhanSo();
    public void NhapVaoPhanSo(int a, int b){
        phanSo.setTuSo(a);
        phanSo.setMauSo(b);
    }
    public void XuatPhanSo(){
        phanSo.XuatPhanSo();
    }
    public void RutGonPhanSo(){
    }
    public PhanSo TruHaiPhanSo(PhanSo ps2){
        int a = phanSo.getTuSo()* ps2.getMauSo() - phanSo.getMauSo()* ps2.getTuSo();
        int b = phanSo.getMauSo()* ps2.getMauSo();
        return new PhanSo(a,b);
    }
    public PhanSo ChiaHaiPhanSo(PhanSo ps2){
        int a = phanSo.getTuSo()* ps2.getMauSo();
        int b = phanSo.getMauSo()*ps2.getTuSo();
        return new PhanSo(a,b);
    }
    public PhanSo TinhTong2PhanSo(PhanSo ps1, PhanSo ps2){
        int a = ps1.getTuSo()*ps2.getMauSo()+ps2.getTuSo()*ps1.getMauSo();
        int b = ps1.getMauSo()*ps2.getMauSo();
        return new PhanSo(a,b);
    }
}

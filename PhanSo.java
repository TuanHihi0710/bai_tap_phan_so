public class PhanSo {
    private int tuSo;
    private int mauSo;
    public PhanSo(){
    }
    public PhanSo(int a, int b){
        tuSo=a;
        mauSo=b;
    }

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }
    public void setTuSo(int a){
        tuSo=a;
    }
    public void setMauSo(int b){
        mauSo=b;
    }
    public void XuatPhanSo(){
        System.out.println(getTuSo()+"/"+getMauSo());
    }
}

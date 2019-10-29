package id.ac.polinema.recyclerviewsangatsederhana.models;

public class bunga {
    public String NamaBunga;
    public String DetailBunga;
    public int bunga;

    public bunga(String NamaBunga, String DetailBunga, int bunga) {
        this.NamaBunga=NamaBunga;
        this.DetailBunga=DetailBunga;
        this.bunga=bunga;
    }

    public String getNamaBunga() {
        return NamaBunga;
    }

    public void setNamaBunga(String namaBunga) {
        NamaBunga = namaBunga;
    }

    public String getDetailBunga() {
        return DetailBunga;
    }

    public void setDetailBunga(String detailBunga) {
        DetailBunga = detailBunga;
    }

    public int getBunga() {
        return bunga;
    }

    public void setBunga(int bunga) {
        this.bunga = bunga;
    }
}

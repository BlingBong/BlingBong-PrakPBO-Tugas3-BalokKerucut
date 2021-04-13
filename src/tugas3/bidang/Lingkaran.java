package tugas3.bidang;

public class Lingkaran implements MenghitungBidang {
    private double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double luas() {
        return Math.PI*getJari()*getJari();
    }

    @Override
    public double keliling() {
        return 2*Math.PI*getJari();
    }
}

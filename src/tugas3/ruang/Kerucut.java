package tugas3.ruang;

import tugas3.bidang.Lingkaran;

public class Kerucut extends Lingkaran implements MenghitungRuang {
    private double tinggiKerucut;

    public Kerucut(double jari, double tinggiKerucut) {
        super(jari);
        this.tinggiKerucut = tinggiKerucut;
    }

    public double getTinggiKerucut() {
        return tinggiKerucut;
    }

    public void setTinggiKerucut(double tinggiKerucut) {
        this.tinggiKerucut = tinggiKerucut;
    }

    @Override
    public double volume() {
        return (luas()*getTinggiKerucut())/3;
    }

    @Override
    public double luasPermukaan() {
        double s = Math.sqrt((getJari()*getJari())+(getTinggiKerucut()*getTinggiKerucut())); //garis pelukis
        return Math.PI*getJari()*(getJari()+s);
    }
}

// Nama: Retno Eka Triatry 
// Nim: 24060123140188
// Tanggal : 13 Maret 2025

class Lingkaran extends BangunDatar implements IResize {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    public double getLuas() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void zoomIn(double factor) {
        radius *= factor;
    }

    @Override
    public void zoomOut(double factor) {
        radius /= factor;
    }
}


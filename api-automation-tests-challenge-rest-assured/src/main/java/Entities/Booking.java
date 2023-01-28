package Entities;


public class Booking {
    private String Sobrenome;
    private String primeironome;
    private float precototal;
    private boolean depositopago;
    private BookingDates datadereserva;
    private String necessidadesadicionais;

    public Booking(String Carla, String Santos, float precototal, boolean depositopago, BookingDates datadereserva, String necessidadesadicionai) {
        this.primeironome = Carla;
        this.Sobrenome = Santos;
        this.precototal = precototal;
        this.depositopago = depositopago;
        this.datadereserva = datadereserva;
        this.necessidadesadicionais = necessidadesadicionais;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public String getPrimeironome() {
        return primeironome;
    }

    public void setPrimeironome(String primeironome) {
        this.primeironome = primeironome;
    }

    public float getPrecototal() {
        return precototal;
    }

    public void setPrecototal(float precototal) {
        this.precototal = precototal;
    }

    public boolean isDepositopago() {
        return depositopago;
    }

    public void setDepositopago(boolean depositopago) {
        this.depositopago = depositopago;
    }

    public BookingDates getDatadereserva() {
        return datadereserva;
    }

    public void setDatadereserva(BookingDates datadereserva) {
        this.datadereserva = datadereserva;
    }

    public String getNecessidadesadicionais() {
        return necessidadesadicionais;
    }

    public void setNecessidadesadicionais(String necessidadesadicionais) {
        this.necessidadesadicionais = necessidadesadicionais;
    }


}

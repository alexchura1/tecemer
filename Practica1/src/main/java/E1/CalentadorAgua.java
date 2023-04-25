package E1;

public class CalentadorAgua {
    // atributos
    private double temperatura;
    private double tempMin;
    private double tempMax;
    private double incremento;
    private boolean enFuncionamiento;

    // constructor
    public CalentadorAgua(double tempMin, double tempMax, double incremento, boolean enFuncionamiento) {
        this.temperatura = tempMin;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.incremento = incremento;
        this.enFuncionamiento = false;
    }

    // getters y setters
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }
    
    public boolean isEnFuncionamiento() {
        return enFuncionamiento;
    }

    public void setEnFuncionamiento(boolean enFuncionamiento) {
        this.enFuncionamiento = enFuncionamiento;
    }


    // métodos para calentar y enfriar el agua
    public void calentarAgua() {
        if (temperatura + incremento <= tempMax) {
            temperatura += incremento;
        } else {
            System.out.println("La temperatura ha alcanzado su valor máximo");
        }
    }

    public void enfriarAgua() {
        if (temperatura - incremento >= tempMin) {
            temperatura -= incremento;
        } else {
            System.out.println("La temperatura ha alcanzado su valor mínimo");
        }
    }
    
    public void encender() {
        if(this.enFuncionamiento == false){
            this.enFuncionamiento = true;
            System.out.println("Calentador encendido.");
        }else{
            System.out.println("El calentador ya esta encendido, no lo puedes encender.");
        }
    }
    
    public void detener() {
        this.enFuncionamiento = false;
        System.out.println("Calentador apagado.");
    }
}
